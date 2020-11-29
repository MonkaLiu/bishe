package com.hua.shi.rmd.service.category;

import com.hua.shi.rmd.domain.entity.category.CategoryInfo;
import com.hua.shi.rmd.domain.entity.category.CategoryInfoExample;
import com.hua.shi.rmd.dto.response.Category;
import com.hua.shi.rmd.mapper.category.CategoryInfoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Slf4j
@Api(value = "资产管理类", tags = {"资产管理类模块"})
@RestController
@RequestMapping("/category")
public class CategoryService {

    @Resource
    private CategoryInfoMapper categoryInfoMapper;

    @RequestMapping(value = "/getCategoryAssetInfo")
    @ResponseBody
    @ApiOperation(value = "资产大、小类收益风险列表", httpMethod = "GET", notes = "get AssetInfo list", response = Map.class)
    public List<Category> listCategoty(String startTime, String endTime, String calculateType) {
        CategoryInfoExample categoryInfoExample = new CategoryInfoExample();
        categoryInfoExample.setOrderByClause(" id asc ");
        List<Category> categoryList = Lists.newArrayList();
        List<CategoryInfo> categoryInfos = categoryInfoMapper.selectByExample(categoryInfoExample);
        for (CategoryInfo categoryInfo : categoryInfos) {
            Category category = new Category();
            category.setId(String.valueOf(categoryInfo.getId()));
            category.setBdCode(categoryInfo.getBigCode());
            category.setBdName(categoryInfo.getBigName());
            category.setBgCode(categoryInfo.getBigCode());
            category.setBgName(categoryInfo.getBigName());
            category.setSmCode(categoryInfo.getSmallCode());
            category.setSmName(categoryInfo.getSmallName());
            category.setRiskRatio(categoryInfo.getRiskRatio());
            category.setYieldRatio(categoryInfo.getYieldRatio());
            categoryList.add(category);

        }
        return  categoryList;
    }

}

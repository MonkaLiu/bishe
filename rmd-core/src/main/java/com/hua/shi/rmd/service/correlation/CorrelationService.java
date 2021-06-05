package com.hua.shi.rmd.service.correlation;


import com.hua.shi.rmd.domain.entity.category.CategoryInfo;
import com.hua.shi.rmd.domain.entity.category.CategoryInfoExample;
import com.hua.shi.rmd.facade.CorrelationFacadeService;
import com.hua.shi.rmd.mapper.category.CategoryInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author :ls
 * @version :V1.0
 * @Description:
 * @date :2021年6月5日 下午4:38:02
 */
@Controller
@RequestMapping("/correlation")
public class CorrelationService {

    @Autowired
    private CategoryInfoMapper categoryInfoMapper;

    @Autowired
    private CorrelationFacadeService correlationFacadeService;

    /*
     * @Auth:ls
     * @Date:2021-06-05
     * @Desc:计算标的之间相关系数
     * */
    @RequestMapping(value = "/getCorrelationCoefficentNew", method = RequestMethod.GET)
    @ResponseBody
    public List<List<BigDecimal>> getCorrelationCoefficentNew(String startTime, String endTime) {
        List<List<BigDecimal>> correlationCoefficent = new ArrayList<>();

        List<String> distinctCode = new ArrayList<String>();
        CategoryInfoExample categoryInfoExample = new CategoryInfoExample();
        categoryInfoExample.setOrderByClause("id asc");
        List<CategoryInfo> categoryInfos = categoryInfoMapper.selectByExample(categoryInfoExample);
        distinctCode = categoryInfos.stream().map(obj -> obj.getSmallCode()).distinct().collect(Collectors.toList());

        correlationCoefficent = correlationFacadeService.getCorrelationCoefficent(distinctCode, startTime, endTime);

        return correlationCoefficent;
    }

}

package com.hua.shi.rmd.service.group;


import com.hua.shi.rmd.domain.entity.group.GroupBasic;
import com.hua.shi.rmd.mapper.group.GroupBasicMapper;
import com.hua.shi.rmd.vo.BasicGroupVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 组合调整模块
 * @author zhaodc
 */

@Api(value = "prdGroupAjust")
@RestController
@RequestMapping("/prdGroupAjust/")
public class GroupPmService {

    @Resource
    private GroupBasicMapper groupBasicMapper;

    /**
     * 查询临时表组合小类信息
     *
     * @param groupId
     * @return
     * @author zhaodc
     */
    @RequestMapping(value = "/qryPrdGroupTmpSMAllFirst", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询临时表组合全部小类信息", httpMethod = "POST", notes = "", response = Integer.class)
    public List<BasicGroupVo> qryPrdGroupTmpSMAllFirst(@RequestParam(value = "groupId") String groupId) {
        List<GroupBasic> groupBasics = groupBasicMapper.getPrdGroupTmpSMAll(groupId);

        List<BasicGroupVo> list = Lists.newArrayList();
        if (CollectionUtils.isEmpty(groupBasics)) {
            return list;
        }

        Map<String, List<GroupBasic>> map = groupBasics.stream().collect(Collectors.groupingBy(GroupBasic::getSmallCode));
        Iterator<Map.Entry<String, List<GroupBasic>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<GroupBasic>> entry = iterator.next();
            BasicGroupVo basicGroupVo = new BasicGroupVo();
            basicGroupVo.setSmcode(entry.getKey());
            List<GroupBasic> groupBasicList = entry.getValue();
            basicGroupVo.setBgcode(groupBasicList.get(0).getBigCode());
            basicGroupVo.setBgname(groupBasicList.get(0).getBigName());
            basicGroupVo.setSmname(groupBasicList.get(0).getSmallName());
            BigDecimal smallWeight = groupBasicList.stream().map(obj -> obj.getWeight()).reduce(BigDecimal.ZERO, BigDecimal::add);
            basicGroupVo.setSmweight(smallWeight);
            list.add(basicGroupVo);

        }
        return list;
    }

}

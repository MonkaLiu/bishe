package com.hua.shi.rmd.service.group;


import com.hua.shi.rmd.domain.entity.group.GroupBasic;
import com.hua.shi.rmd.domain.entity.group.GroupBasicExample;
import com.hua.shi.rmd.mapper.group.GroupBasicMapper;
import com.hua.shi.rmd.vo.BasicGroupVo;
import com.hua.shi.rmd.vo.GroupInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 组合调整模块
 *
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

    /**
     * 查询临时表组合小类信息
     *
     * @param groupId
     * @return
     * @author zhaodc
     */
    @RequestMapping(value = "/qryPrdGroupTmpSM", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询临时表组合信息", httpMethod = "POST", notes = "", response = Integer.class)
    public List<GroupInfoVo> qryPrdGroupTmpSM(@RequestParam(value = "groupId") String groupId, @RequestParam(required = false) String smCode) {
        //return  prdGroupService.qryProductGroupTmp(groupId,smCode);
        GroupBasicExample example = new GroupBasicExample();
        GroupBasicExample.Criteria criteria = example.createCriteria();
        criteria.andGroupCodeEqualTo(groupId);
        if (!StringUtils.isEmpty(smCode)) {
            criteria.andSmallCodeEqualTo(smCode);
        }
        example.setOrderByClause("id desc");
        List<GroupInfoVo> groupInfoVos = Lists.newArrayList();
        List<GroupBasic> groupBasicList = groupBasicMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(groupBasicList)) {
            return groupInfoVos;
        }
        groupInfoVos = groupBasicList.stream().map(obj -> {
            GroupInfoVo groupInfoVo = GroupInfoVo.builder().group_id(obj.getGroupCode())
                    .code(obj.getName())
                    .name(obj.getName())
                    .weight(obj.getWeight())
                    .smcode(obj.getSmallCode())
                    .smname(obj.getSmallName()).build();
            return groupInfoVo;

        }).collect(Collectors.toList());

        List<BasicGroupVo> list = Lists.newArrayList();
        Map<String, List<GroupBasic>> map = groupBasicList.stream().collect(Collectors.groupingBy(GroupBasic::getSmallCode));
        Iterator<Map.Entry<String, List<GroupBasic>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<GroupBasic>> entry = iterator.next();
            BasicGroupVo basicGroupVo = new BasicGroupVo();
            basicGroupVo.setSmcode(entry.getKey());
            BigDecimal smallWeight = groupBasicList.stream().map(obj -> obj.getWeight()).reduce(BigDecimal.ZERO, BigDecimal::add);
            basicGroupVo.setSmweight(smallWeight);
            list.add(basicGroupVo);
        }
        for (GroupInfoVo groupInfoVo : groupInfoVos) {
            String smallCode = groupInfoVo.getSmcode();
            for (BasicGroupVo basicGroupVo : list) {
                if (smallCode.equalsIgnoreCase(basicGroupVo.getSmcode())) {
                    groupInfoVo.setSmweight(basicGroupVo.getSmweight());
                    break;
                }

            }

        }
        return groupInfoVos;
    }

}

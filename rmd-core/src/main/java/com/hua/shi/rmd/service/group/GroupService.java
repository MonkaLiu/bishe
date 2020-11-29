package com.hua.shi.rmd.service.group;

import com.hua.shi.rmd.domain.entity.group.GroupInfo;
import com.hua.shi.rmd.domain.entity.group.GroupInfoExample;
import com.hua.shi.rmd.dto.response.Group;
import com.hua.shi.rmd.enums.RiskLevelEnum;
import com.hua.shi.rmd.mapper.group.GroupInfoMapper;
import com.hua.shi.rmd.util.MyDateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Api(value = "组合管理类", tags = {"组合管理类模块"})
@RestController
@RequestMapping("/generateGroup")
public class GroupService {

    @Resource
    private GroupInfoMapper groupInfoMapper;

    @RequestMapping(value = "/selectGroupInfo", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询MVO组合数据(默认前 5 条记录)", httpMethod = "GET", notes = "", response = String.class)
    public List<Group> selectGroupInfo() {
        List<Group> list = Lists.newArrayList();
        GroupInfoExample groupInfoExample = new GroupInfoExample();
        groupInfoExample.setOrderByClause(" id desc");
        List<GroupInfo> groupInfos = groupInfoMapper.selectByExample(groupInfoExample);
        for (GroupInfo groupInfo : groupInfos) {
            Group group = new Group();
            group.setProductGroupId(groupInfo.getGroupCode());
            group.setGroupName(groupInfo.getGroupName());
            group.setInvestTerm(groupInfo.getInvestTerm());
            group.setMinStartDate(MyDateUtil.format(groupInfo.getMinStartDate(), MyDateUtil.DATE_FORMAT_YYYYMMDD_HHMMSS));
            group.setMaxStartDate(MyDateUtil.format(groupInfo.getMaxStartDate(), MyDateUtil.DATE_FORMAT_YYYYMMDD_HHMMSS));
            group.setDrawDowns(groupInfo.getDropDownRatio() != null ? groupInfo.getDropDownRatio().toString() : "");
            group.setYieldRatio(groupInfo.getYieldRatio() != null ? groupInfo.getYieldRatio().toString() : "");
            group.setRiskLevel(RiskLevelEnum.getName(groupInfo.getRiskLevel()));
            list.add(group);
        }
        return list;
    }

}

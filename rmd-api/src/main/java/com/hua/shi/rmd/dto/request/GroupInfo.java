package com.hua.shi.rmd.dto.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@ApiModel(value = "GroupInfo对象信息")
@Data
public class GroupInfo {
    private String groupCode;   //组合id
    private String groupName; //组合名称
    private Double weights; //产品权重
    private String createDate;    //创建日期
    private Double asset;   //资产额度
    private String yieldRatio;  //收益率
    private Double riskRatio;   //风险率
    private String riskLevel;   //风险级别
    private String productCode;   //产品code
    private String productName; //产品名称
    private String productType;//产品类型
    private String productGroupId;   //产品组合ID
    private String moneySum;    //资产金额
    private String growth;  //涨幅
    private String drawDowns;   //回撤
    private List<Double> bigList;   //大类权重
    private List<String> bigNameList;   //大类名称
    private String bigName;   //大类名称
    private String minStartDate;    //开始日期
    private String maxStartDate;    //结束日期
    private String investTerm;    //投资期限
    private String resinvestTerm;    //投资期限
}

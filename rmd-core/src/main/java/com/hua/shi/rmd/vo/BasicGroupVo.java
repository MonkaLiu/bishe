package com.hua.shi.rmd.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicGroupVo {
    private Integer id ;
    private String group_id ;
    private String bgcode;
    private String bgname;
    private String code;
    private String name;
    private String weight;
    private String product_type;
    private String smcode;
    private String smname;
    private BigDecimal smweight;
    private String create_time;
    private String lastmodtime;
    private String groupRiskLevel;
    private String adjust_number;
    private String adjust_user;
    private String riskLevel;
    private String smallMarket;
}

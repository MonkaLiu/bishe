package com.hua.shi.rmd.dto.response;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Category {

    private String id;
    private String syscode;
    private String sysName;
    private String bgCode;
    private String bgName;
    private String smCode;
    private String smName;
    private String bdCode;
    private String bdName;
    private String status;
    private String restatus;
    private BigDecimal yieldRatio;
    private BigDecimal riskRatio;


}

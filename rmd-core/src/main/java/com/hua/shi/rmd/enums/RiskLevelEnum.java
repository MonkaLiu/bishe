package com.hua.shi.rmd.enums;

public enum RiskLevelEnum {
    COUTIONS((byte)1, "谨慎型"),
    BALANCE((byte)2,"平衡型"),
    RADICALNESS((byte)3,"激进型"),

    ;
    private final byte code;

    private final String name;

    RiskLevelEnum(byte code, String name) {
        this.code = code;
        this.name = name;
    }

    public Byte getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getName(byte code) {
        RiskLevelEnum[] budgetNumberUnitEnums = values();
        for (RiskLevelEnum budgetNumberUnitEnum : budgetNumberUnitEnums) {
            if (budgetNumberUnitEnum.getCode().equals(code)) {
                return budgetNumberUnitEnum.getName();
            }
        }
        return RiskLevelEnum.COUTIONS.name;
    }


}

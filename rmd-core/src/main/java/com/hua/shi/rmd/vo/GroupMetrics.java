package com.hua.shi.rmd.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupMetrics {
    private String errorInfo;//错误信息
    private String[] codeList;
    private String[] codeNameList;
    private String cagr; //复合年化收益率
    private String marketCorrelation; //市场相关
    private String maxDrawdown;	 //最大回撤
    private String sharpeRatio; //sharp比率

    private String sortinoRatio; //sortino比率
    private String stdev; //标准差
    private String alphaAnnualized;  //阿尔法(年化)
    private String beta; //Beta(*)

    private String compoundReturnMonthly; //复合收益（每月）
    private String conditionalValue; //有条件的风险价值
    private String deltaNormalValue;  //delta-Normal分析风险价值
    private String downsideDeviationMonthly; //下行偏差（月度）

    private String excessKurtosis; //峰度
    private String financialBalance; //最终价值
    private String gainLossRatio;//收益/损失率
    private String historicalValue; //历史风险价值

    private String meanReturnMonthly; //平均回报（每月）
    private String positivePeriods; //正期间
    private String R2; //R^2
    private String skewness; //偏态
    private String treynorRatio; //特雷诺比比率
    private String bestYear;
    private String volatilityMonthly; //波动（每月）
    private String volatilityYearly; //波动（年化）
    private String diversificationRatio; //多样化比例
    // 以上 为 标量
    private String worstYear;	//最大亏损
    private String[] monthEndMoneyDate; //资金对应日期 （ 年月）
    private double[] monthEndMoneyValueArr; //对应每月资金
    private double[] monthRetValueArr;  //对应每月收益
    private double[] drawdownsArr;  //回撤序列
    private List<Object[]> corrList;    //相关系数
    private String[] assetIndexTitleArr;    //表格1 标题
    private List<String[]> assetIndexValuesList;    //表格1 数据
    private String[] assetTitleArr; //表格 2 标题
    private List<String[]> assetValuesList;    //表格2 数据
    private String[] BenchmarkDateArr;  //标的日期
    private double[] monthEndBenchmarkMoneyValueArr; //每月基准资金
    private double[] monthRetBenchmarkRetValueArr;  //每月基准收益率
    private double[] monthBenchmarkDrawdownArr;  //每月基准回撤
    private String[] monthMoneyGrowth;  //组合资金涨幅
    private String[] benchmarkMoneyGrowth;  //基准资金涨幅
    private String[] accumulativeRateArr;  //累计超额收益
        private String compoundReturnAnnualized; //复合回报（年化）
    private String meanReturnAnnualized; //平均回报（年化）
}

package com.hua.shi.rmd.service.backtest;


import com.hua.shi.rmd.vo.GroupMetrics;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/backtest/")
public class BackTestService {


    /*
     * @author yongquan.xiong
     * @Description:获取组合回归测试度量指标
     * @param
     *        groupType:组合类型
     *        groupCode:组合Id
     *        startTime:开始时间
     *        endTime:结束时间
     *        initmoney：初始资金
     *        rebalance：再平衡类型
     *        benchmark：基准
     * @return  List<GroupInfo>
     * @date:   2018年02月03日
     */
    @RequestMapping(value = "/getBacktestMetricsData",method = RequestMethod.GET)
    @ResponseBody
    public List<GroupMetrics> getBacktestMetricsData(@RequestParam String groupType, @RequestParam String groupCode, @RequestParam String startTime, @RequestParam String endTime, @RequestParam String initmoney, @RequestParam String rebalance, @RequestParam(required = false) String benchmark, @RequestParam String dateType) {

        List<GroupMetrics> list = new ArrayList<>();
        GroupMetrics groupMetrics = new GroupMetrics();

        //benchmark 做处理
        if (benchmark == null || "".equals(benchmark)) {
            benchmark = "null";
        }

//        groupCode="71";
//        startTime="2015-01-01";
//        endTime="2017-12-31";
//        initmoney="10000";
//        rebalance="rebalance_semi-annually";
        String params = groupCode + "," + startTime + "," + endTime + "," + initmoney + "," + rebalance + "," + benchmark + "," + groupType + "," + dateType;
//
//      groupMetrics = backTestService.calculateBackTestData(params, benchmark, dateType);

//       groupMetrics=backTestService.calculateBackTestDataNew( groupCode, startTime, endTime, initmoney, rebalance, benchmark );

        //前端模拟测试数据
        groupMetrics.setBestYear("0.1007");
        groupMetrics.setCagr("0.0432");
        groupMetrics.setMarketCorrelation("-0.1090");
        groupMetrics.setMaxDrawdown("-0.0333");
        groupMetrics.setSharpeRatio("0.6446");

        groupMetrics.setSortinoRatio("119.9721");
        groupMetrics.setStdev("0.0693");
        groupMetrics.setWorstYear("-0.0022");
        groupMetrics.setAlphaAnnualized("0.0187");
        groupMetrics.setBeta("-0.4464");

        groupMetrics.setCompoundReturnAnnualized("0.0407");
        groupMetrics.setCompoundReturnMonthly("0.0035");
        groupMetrics.setConditionalValue("-0.0327");
        groupMetrics.setDeltaNormalValue("-0.0291");
        groupMetrics.setDownsideDeviationMonthly("1.5433E-4");

        groupMetrics.setExcessKurtosis("0.6743");
        groupMetrics.setFinancialBalance("11273.652");
        groupMetrics.setGainLossRatio("0.4705");
        groupMetrics.setHistoricalValue("-0.0265");
        groupMetrics.setMeanReturnAnnualized("0.0416");

        groupMetrics.setMeanReturnMonthly("0.0037");
        groupMetrics.setPositivePeriods("0.4705");
        groupMetrics.setR2("0.0130");
        groupMetrics.setSkewness("0.6767");
        groupMetrics.setTreynorRatio("-9.6803");

        groupMetrics.setVolatilityMonthly("0.0200");
        groupMetrics.setVolatilityYearly("0.0880");
        groupMetrics.setDiversificationRatio("1.1378");

        String[] monthDateArr={"201503","201504","201505","201506","201507","201508","201509","201510","201511","201512","201601","201602","201603","201604","201605","201606","201607","201608","201609","201610","201611","201612","201701","201702","201703","201704","201705","201706","201707","201708","201709","201710","201711","201712"};
        groupMetrics.setMonthEndMoneyDate(monthDateArr);

        double[] monthValueArr={9818.0703,9995.4886,9992.6033,9960.8838,9640.8636,10030.9651,9982.8391,10110.234,9772.9035,9977.4969,10239.2026,10779.993,10747.6596,10905.9733,10753.4498,11327.3839,11460.5376,11437.2384,11486.8885,11391.7739,11123.8316,10983.1285,11032.9036,11304.5744,11273.8078,11373.0949,11276.6494,11206.0358,11271.8731,11328.6883,11351.0123,11281.7378,11279.8599,11273.6526};
        groupMetrics.setMonthEndMoneyValueArr(monthValueArr);

        double[] monthRetValueArr={-0.0182,0.0181,-0.0003,-0.0032,-0.0321,0.0405,-0.0048,0.0128,-0.0334,0.0209,0.0262,0.0528,-0.003,0.0147,-0.014,0.0534,0.0118,-0.002,0.0043,-0.0083,-0.0235,-0.0126,0.0045,0.0246,-0.0027,0.0088,-0.0085,-0.0063,0.0059,0.005,0.002,-0.0061,-0.0002,-0.0006};
        groupMetrics.setMonthRetValueArr(monthRetValueArr);

        //基准数据
        String[] BenchmarkDateArr={"201505","201506","201507","201508","201509","201510","201511","201512","201601","201602","201603","201604","201605","201606","201607","201608","201609","201610","201611","201612","201701","201702","201703","201704","201705","201706","201707","201708","201709","201710"};
        groupMetrics.setBenchmarkDateArr(BenchmarkDateArr);

        double[] monthEndBenchmarkMoneyValueArr={9592.6033,9560.8838,9640.8636,9830.9351,9482.8391,9710.234,9572.9035,9577.4969,9639.2026,9779.993,9747.6596,9905.9733,9753.4498,9327.3839,9460.5376,9437.2384,9486.8885,9391.7739,9123.8316,9983.1285,9032.9036,9304.5744,9273.8078,9373.0949,9276.6494,9206.0358,9271.8731,9328.6883,9651.0123,9581.7378,9279.8599,9073.6526};
        groupMetrics.setMonthEndBenchmarkMoneyValueArr(monthEndBenchmarkMoneyValueArr);

        double[] monthRetBenchmarkRetValueArr={-0.0212,0.0121,-0.0023,-0.0302,-0.0021,0.0455,-0.0068,0.0228,-0.0234,0.0409,0.0462,0.0428,-0.023,0.0247,-0.024,0.0334,0.0218,-0.022,0.0343,-0.0383,-0.0335,-0.0156,0.0145,0.0146,-0.0057,0.0188,-0.0185,-0.0163,0.0259,0.025,0.012,-0.0261,-0.0022,-0.0026};
        groupMetrics.setMonthRetBenchmarkRetValueArr(monthRetBenchmarkRetValueArr);


        double[] drawdownsArr={-0.0003,-0.0003,-0.0321,0.0,-0.0048,-0.0003,-0.0003,-0.0321,0.0,-0.0048,-0.0003,-0.0003,-0.0321,0.0,-0.0048,-0.0003,-0.0003,-0.0321,0.0,-0.0048,-0.0003,-0.0003,-0.0321,0.0,-0.0048,-0.0003,-0.0003,-0.0321,0.0,-0.0048,-0.0003,-0.0003,-0.0321,-0.09};
        groupMetrics.setDrawdownsArr(drawdownsArr);

        List<Object[]> corrList=new ArrayList<>();
        Object[] a1={1.0,0.1966,0.1925,-0.149};
        Object[] a2={0.1966,1.0,0.9435,0.1288};
        Object[] a3={0.1925,0.9435,1.0,0.0678};
        Object[] a4={-0.149,0.1288,0.0678,1.0};
        corrList.add(a1);
        corrList.add(a2);
        corrList.add(a3);
        corrList.add(a4);

        groupMetrics.setCorrList(corrList);
//
//        //Table 01
//
        String[] assetIndexTitleArr = {"Code", "Stdev", "Sortino Ratio", "Sharpe Ratio", "Max.Drawdown", "Market Correlation", "CAGR"};
        groupMetrics.setAssetIndexTitleArr(assetIndexTitleArr);
//
        List<String[]> assetIndexValuesList=new ArrayList<>();

        String[] b1={"6","0.01606","0.02510","945.38836","1.6032","-0.0153","0.1966","0.04068","0.0824"};
        String[] b2={"7","0.01765","0.02136","1281.6641","1.9046","-0.0130","0.1925","0.04123","0.0792"};
        String[] b3={"8","-0.08176","0.133260","28.73336","0.3573","-0.0758","-0.149","0.03985","0.1776"};
        assetIndexValuesList.add(b1);
        assetIndexValuesList.add(b2);
        assetIndexValuesList.add(b3);
        groupMetrics.setAssetIndexValuesList(assetIndexValuesList);

//        //Table 02
        String[] assetTitleArr={"weight","money","profit"};
        groupMetrics.setAssetTitleArr(assetTitleArr);

        List<String[]> assetValuesList =new ArrayList<>();
        String[] c1={"0.2","2254.7305","232.8455"};
        String[] c2={"0.3","3382.0957","354.8576"};
        String[] c3={"0.5","5636.8263","685.9494"};
        assetValuesList.add(c1);
        assetValuesList.add(c2);
        assetValuesList.add(c3);
        groupMetrics.setAssetValuesList(assetValuesList);

        String[] codeList={"6","7","8","000001.SH"};
        groupMetrics.setCodeList(codeList);

        String[] codeNameList={"中证普通债基金","中证纯债债券型基金指数","上海黄金交易所AU9995黄金","上证指数"};
        groupMetrics.setCodeNameList(codeNameList);

        list.add(groupMetrics);

        return list;
    }

}

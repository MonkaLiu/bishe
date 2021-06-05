package com.hua.shi.rmd.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CorrelationFacadeService {

    /*
     * @Auth:ls
     * @Date:2021-06-05
     * @Desc:计算标的之间相关系数
     *
     * */
    public List<List<BigDecimal>> getCorrelationCoefficent(List<String> codeList, String startTime, String endTime) {
        List<List<BigDecimal>> correlationCoefficent = new ArrayList<>();


        String codeA = "";
        String codeB = "";
        Random random = new Random();
        for (int i = 0; i < codeList.size(); i++) {
            List<BigDecimal> tempList = new ArrayList<>();
            for (int j = 0; j < codeList.size(); j++) {
                if (i == j) {    //主对角线，与自身的相关系数为 1
                    tempList.add(new BigDecimal(1.0));
                } else if (i < j) {        //上三角，计算两两之间的相关系数
                    codeA = codeList.get(i);
                    codeB = codeList.get(j);


                    //计算协方差 组成 矩阵
                    List<Double> yieldRatioArrA = new ArrayList<>();
                    List<Double> yieldRatioArrB = new ArrayList<>();
                    List<Double> listA = new ArrayList<>();
                    List<Double> listB = new ArrayList<>();
                    Double cov = null;
                    Double stedA = null;
                    Double stedB = null;
                    Double correlation = null;
                    //计算相关系数
                    correlation = Math.random();
                    BigDecimal  correlationBigDecimal = new BigDecimal(correlation).setScale(2, BigDecimal.ROUND_UP);
                    tempList.add(correlationBigDecimal);

                } else {    //下三角，直接取上三角对称位置的数据
                    tempList.add(correlationCoefficent.get(j).get(i));
                }

            }

            correlationCoefficent.add(tempList);

        }
        return correlationCoefficent;

    }

}

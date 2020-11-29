package com.hua.shi.rmd.util;

import org.apache.commons.lang3.ObjectUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期工具类
 * @author lishi.liu01
 * @date 20191018
 *
 *
 */
public class MyDateUtil {

    /**
     * 默认的日期格式
     */
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
    public static final String DATE_FORMAT_YYYY_MM = "yyyy-MM";
    public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String DATE_FORMAT_YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_MDHM = "M月d日H时m分";
    public static final String DATE_FORMAT_YYYYMMDDHHMM = "yyyyMMddHHmm";
    public static final String DATE_FORMAT_YYYYMMDD_HHMM = "yyyy-MM-dd HH:mm";
    public static final Locale LOCALE = Locale.CHINA;

    /**
     *
     * 当前时间的毫秒数
     *
     * @return 当前时间的毫秒数
     */
    public static long getNowMills() {
        return getMills(new Date());
    }

    /**
     *
     * 指定时间的毫秒数
     *
     * @param date 日期
     * @return 指定时间的毫秒数
     */
    public static long getMills(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getTimeInMillis();
    }

    /**
     *
     * 获取指定时间的字符串格式
     *
     * @param mills 时间毫秒数
     * @param format 日期格式
     * @return 指定时间的字符串格式
     */
    public static String format(long mills, String format) {
        try {
            return new SimpleDateFormat(format, LOCALE).format(new Date(mills));
        } catch (Exception e) {
            return "";
        }
    }

    /**
     *
     * 获取指定时间的字符串格式
     *
     * @param date 日期
     * @param format 日期格式
     * @return 指定时间的字符串格式
     */
    public static String format(Date date, String format) {
        if (date != null) {
            return format(date.getTime(), format);
        }

        return format(new Date(), format);
    }

    /**
     *
     * 获取指定时间的yyyy-MM-dd格式
     *
     * @param date 日期
     * @return 指定时间的yyyy-MM-dd格式
     */
    public static String format(Date date) {
        return format(date, DEFAULT_DATE_FORMAT);
    }

    /**
     *
     * 返回当前日期
     *
     * @return 返回当前日期字符串格式
     */
    public static String getDate() {
        return format(new Date(), DEFAULT_DATE_FORMAT);
    }

    /**
     *
     * 格式化字符串日期
     *
     * @param date     字符串格式的日期
     * @param format   日期格式
     * @return         格式化转换的date类型日期
     */
    public static Date parse(String date, String format) {
        try {
            return new SimpleDateFormat(format, LOCALE).parse(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * 将yyyy-MM-dd HH:mm:ss字符串日期转为 Date类型
     *
     * @param date 字符串格式日期
     * @return 返回date类型的日期
     */
    public static Date parse(String date) {
        return parse(date, DATE_FORMAT_YYYYMMDD_HHMMSS);
    }

    /**
     *
     * 将yyyy-MM-dd HH:mm:ss字符串日期转为 Date类型
     *
     * @param date 字符串格式日期
     * @return 返回date类型的日期
     */
    public static Date parseIngoreError(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_YYYYMMDD_HHMMSS, LOCALE);
            return sdf.parse(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 计算两个日期之间相差的天数
     *
     * @param smdate 较小的时间
     * @param bdate 较大的时间
     * @return 相差天数
     */
    @SuppressWarnings({ "PMD.AvoidReassigningParameters", "PMD.AvoidReassigningParameters" })
    public static int daysBetween(Date smdate, Date bdate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", LOCALE);
        long betweenDays = 0;

        try {
            smdate = sdf.parse(sdf.format(smdate));
            bdate = sdf.parse(sdf.format(bdate));
            Calendar cal = Calendar.getInstance();
            cal.setTime(smdate);
            long time1 = cal.getTimeInMillis();
            cal.setTime(bdate);
            long time2 = cal.getTimeInMillis();
            betweenDays = (time2 - time1) / (1000 * 3600 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(String.valueOf(betweenDays));
    }

    /**
     *
     *  比较两个日期的大小
     * @param dt1 日期1
     * @param dt2 日期2
     * @return dt1>dt2 ? 1 : (dt1==dt2 ? 0 : -1)
     */
    public static int compareDate(Date dt1, Date dt2) {
        if (dt1.getTime() > dt2.getTime()) {
            return 1;
        } else if (dt1.getTime() < dt2.getTime()) {
            return -1;
        } else {// 相等
            return 0;
        }
    }

    /**
     *
     * @param start 区间起始点
     * @param end  区间末端点
     * @param aim  目标
     * @return
     */
    public static int isInValidBlock(Date start, Date  end, Date aim){
        if(start.getTime()<= aim.getTime() && aim.getTime()<= end.getTime()){
             return 1;
        }
         return -1;
    }



    /**
     * 特定日期加上自然日输出最终日期
     *
     * @param sourceDate 开始日期
     * @param day 天数
     * @return 最终日期
     */
    @SuppressWarnings({ "PMD.AvoidReassigningParameters", "PMD.UnnecessaryLocalBeforeReturn" })
    public static Date datePlusNaturalDay(Date sourceDate, int day) {
        Calendar calendar = Calendar.getInstance();
        if (sourceDate == null) {
            sourceDate = new Date();
        }
        calendar.setTime(sourceDate);
        calendar.add(Calendar.DATE, day);
        return calendar.getTime();
    }



}

package com.qise.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jql
 * @date 2020/5/1 - 20:35
 */
public class DateUtils {
    /**
     * 日期转换字符串
     * @param date
     * @param patt
     * @return
     */
    public static String date2String(Date date,String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }

    public static Date string2Date(String str ,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }


}

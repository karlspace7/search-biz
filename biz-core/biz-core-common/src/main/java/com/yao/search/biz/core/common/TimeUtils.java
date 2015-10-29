package com.yao.search.biz.core.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by karls_000 on 15-6-24.
 */
public class TimeUtils
{
    public static String loadSimpleDate(long day) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date(date.getTime() + day * AdminConstants.hourOfDay));
    }

    public static String getNowTime()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    public static String formatTimeToCn(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}

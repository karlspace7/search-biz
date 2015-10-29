package com.yao.search.biz.core.common;

/**
 * Created by karls_000 on 15-6-15.
 */
public class AdminConstants
{
    public final static String defaultLoggerPrefix = "search-index-";

    public final static int defaultCoreThreadSize = 5;

    public final static int defaultMaxThreadSize = 5;

    public final static long autoRefresh = 3000;

    public final static long hourOfDay = 24 * 60 * 60 * 1000;

    public final static long bulkIndexDefaultTimeout = 2 * 60 * 1000;

}

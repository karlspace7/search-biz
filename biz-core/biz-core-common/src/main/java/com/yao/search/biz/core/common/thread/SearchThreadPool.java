package com.yao.search.biz.core.common.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 搜索的线程池
 */
public class SearchThreadPool
{

    /**
     * 新建一个缓存线程池
     *
     * @param param
     * @return
     */
    public static ThreadPoolExecutor newCachedThreadPool(ThreadPoolParam param) {
        return new ThreadPoolExecutor(param.getCorePoolSize(),
                param.getMaximumPoolSize(),
                param.getKeepAliveTime(), TimeUnit.MILLISECONDS,
                param.getQueues() == 0 ? new SynchronousQueue<Runnable>() :
        			(param.getQueues() < 0 ? new LinkedBlockingQueue<Runnable>()
        					: new LinkedBlockingQueue<Runnable>(param.getQueues())),
        		new StandardThreadFactory(param.getName(), true), new AbortPolicyReport(param.getName(), param));
    }

}
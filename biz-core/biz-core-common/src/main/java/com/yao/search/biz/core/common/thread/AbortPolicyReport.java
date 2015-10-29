package com.yao.search.biz.core.common.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 扩展线程拒绝任务的处理程序，仅作了日志记录
 */
public class AbortPolicyReport extends ThreadPoolExecutor.AbortPolicy
{

    private static Logger logger = LoggerFactory.getLogger(AbortPolicyReport.class);

    private final String threadName;

    private final ThreadPoolParam param;

    public AbortPolicyReport(String threadName, ThreadPoolParam param)
    {
        this.threadName = threadName;
        this.param = param;
    }

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e)
    {
        String msg = String.format("Thread pool is EXHAUSTED!" +
                " Thread Name: %s, Pool Size: %d (active: %d, core: %d, max: %d, largest: %d), Task: %d (completed: %d)," +
                " Executor status:(isShutdown:%s, isTerminated:%s, isTerminating:%s), msg : %s!",
                threadName, e.getPoolSize(), e.getActiveCount(), e.getCorePoolSize(), e.getMaximumPoolSize(), e.getLargestPoolSize(),
                e.getTaskCount(), e.getCompletedTaskCount(), e.isShutdown(), e.isTerminated(), e.isTerminating(),
                param.getMsg());
        logger.warn(msg);
        throw new RejectedExecutionException(msg);
    }

}
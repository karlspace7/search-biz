package com.yao.search.biz.core.common.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 标准的线程创建工厂，重新实现了newThread，为了统一线程名
 */
public class StandardThreadFactory implements ThreadFactory
{

    private static final AtomicInteger POOL_SEQ = new AtomicInteger(1);

    private final AtomicInteger sThreadNum = new AtomicInteger(1);

    private final String sPrefix;

    private final boolean sDaemo;

    private final ThreadGroup sGroup;

    public StandardThreadFactory()
    {
        this("pool-" + POOL_SEQ.getAndIncrement(), false);
    }

    public StandardThreadFactory(String prefix)
    {
        this(prefix, false);
    }

    public StandardThreadFactory(String prefix, boolean daemo)
    {
        sPrefix = prefix + "-thread-";
        sDaemo = daemo;
        SecurityManager s = System.getSecurityManager();
        sGroup = (s == null) ? Thread.currentThread().getThreadGroup() : s.getThreadGroup();
    }

    @Override
    public Thread newThread(Runnable runnable)
    {
        String name = sPrefix + sThreadNum.getAndIncrement();
        Thread ret = new Thread(sGroup, runnable, name, 0);
        ret.setDaemon(sDaemo);
        return ret;
    }

    public ThreadGroup getThreadGroup()
    {
        return sGroup;
    }
}
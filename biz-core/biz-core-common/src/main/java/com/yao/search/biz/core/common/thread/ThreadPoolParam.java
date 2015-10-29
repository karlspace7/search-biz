package com.yao.search.biz.core.common.thread;


import com.yao.search.biz.core.common.Constants;

/**
 * 线程池创建参数
 */
public class ThreadPoolParam
{
    public ThreadPoolParam(int corePoolSize, int maximumPoolSize, long keepAliveTime, int queues,
                           String name, String msg)
    {
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.keepAliveTime = keepAliveTime;
        this.queues = queues;
        this.name = name;
        this.msg = msg;
    }

    /**
     * 核心线程数
     */
    private int corePoolSize;
    /**
     * 最大线程数
     */
    private int maximumPoolSize;
    /**
     * 多出的线程在空闲时间超过 keepAliveTime 时将会终止
     */
    private long keepAliveTime;

    private int queues;

    private String name = Constants.defaultAppName;
    private String msg = "no message...";

    public int getCorePoolSize()
    {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize)
    {
        this.corePoolSize = corePoolSize;
    }

    public int getMaximumPoolSize()
    {
        return maximumPoolSize;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMaximumPoolSize(int maximumPoolSize)
    {
        this.maximumPoolSize = maximumPoolSize;
    }

    public long getKeepAliveTime()
    {
        return keepAliveTime;
    }

    public void setKeepAliveTime(long keepAliveTime)
    {
        this.keepAliveTime = keepAliveTime;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public int getQueues()
    {
        return queues;
    }

    public void setQueues(int queues)
    {
        this.queues = queues;
    }
}

package com.yao.search.biz.core.elastic.client;

/**
 * Created by archor on 10/30/15.
 */
public class AbstractClient {

    // 集群名
    private String clusterName = "elasticsearch";
    // 是否数据节点
    private boolean isDate = false;
    // 客户端去嗅探整个集群的状态
    private boolean clientTransportSniff = true;
    // 连接前是否忽略集群名验证
    private boolean clientIgnoreClusterName = Boolean.FALSE;
    // 超时时间
    private String clientPingTimeout = "5s";
    // 设置已连接node的连接测试的时间间隔
    private String clientNodesSamplerInterval = "5s";
}

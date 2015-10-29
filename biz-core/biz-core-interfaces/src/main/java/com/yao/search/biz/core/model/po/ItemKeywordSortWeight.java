package com.yao.search.biz.core.model.po;

import java.util.Date;

/**
 * 商品对于关键词的排序权重加分
 */
public class ItemKeywordSortWeight {
    private int id;
    /**
     * btoc_item.id
     */
    private int itemId;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 权重分数
     */
    private double weight;
    /**
     * 关键字类型：人工（0）、机器（1）
     */
    private int type;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 新建（0）、启用（1）、暂停（2）、删除（3）
     */
    private int status;

    public int getItemId() {
        return itemId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

package com.yao.search.biz.core.model.po;

/**
 * search_full_info中统计的原始热搜词
 */
public class OriginalSuggestWordArgs extends OriginalSuggestWord {

    private String startTime;

    private String endTime;

    private int limti;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getLimti() {
        return limti;
    }

    public void setLimti(int limti) {
        this.limti = limti;
    }
}

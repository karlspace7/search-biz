package com.yao.search.biz.core.model.po;

/**
 * search_full_info中统计的原始热搜词
 */
public class OriginalSuggestWord {

    /**
     * 关键词
     */
    private String word;

    /**
     * 热搜程度
     */
    private int hot;

    /**
     * 得分
     */
    private double score;

    /**
     * 搜索频率
     */
    private int count;

    /**
     * 搜索结果数
     */
    private int resultCount;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }
}

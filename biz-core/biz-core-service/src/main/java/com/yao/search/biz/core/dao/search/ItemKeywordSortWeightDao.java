package com.yao.search.biz.core.dao.search;

import com.yao.search.biz.core.model.po.ItemKeywordSortWeight;

import java.util.List;

/**
 * 商品对于关键词的排序权重加分
 */
public interface ItemKeywordSortWeightDao {

    public int insertSortWeight(ItemKeywordSortWeight sortWeight);

    public List<ItemKeywordSortWeight> querySortWeight(ItemKeywordSortWeight sortWeightArgs);

}

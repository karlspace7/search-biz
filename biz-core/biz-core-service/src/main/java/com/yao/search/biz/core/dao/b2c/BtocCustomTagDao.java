package com.yao.search.biz.core.dao.b2c;

import com.yao.search.biz.core.model.po.ItemKeywordSortWeight;

import java.util.List;

/**
 * 移动端，标签
 */
public interface BtocCustomTagDao {

    public List<ItemKeywordSortWeight> queryAll();

}

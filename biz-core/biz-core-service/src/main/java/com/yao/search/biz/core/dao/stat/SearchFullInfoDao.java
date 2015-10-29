package com.yao.search.biz.core.dao.stat;

import com.yao.search.biz.core.model.po.OriginalSuggestWord;

import java.util.List;

/**
 * Created by archor on 10/29/15.
 */
public interface SearchFullInfoDao {

    public List<OriginalSuggestWord> queryOriginalSuggestWord();
}

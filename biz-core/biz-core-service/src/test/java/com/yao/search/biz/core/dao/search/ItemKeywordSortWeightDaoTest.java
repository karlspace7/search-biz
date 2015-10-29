package com.yao.search.biz.core.dao.search;

import com.yao.search.biz.core.model.po.ItemKeywordSortWeight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:config/core/spring-database.xml"
        })
public class ItemKeywordSortWeightDaoTest {

    @Autowired
    ItemKeywordSortWeightDao itemKeywordSortWeightDao;

    @Test
    public void testInsertSortWeight(){


    }

    @Test
    public void testQuerySortWeight() throws Exception{

        ItemKeywordSortWeight iksw = new ItemKeywordSortWeight();
        List<ItemKeywordSortWeight> ikswList = itemKeywordSortWeightDao.querySortWeight(iksw);

        System.out.println(ikswList.size());
    }

}

package com.yao.search.biz.core.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by karls_000 on 15-7-16.
 */
public class SymbolUtils
{
    public static String removeSymbol(String word){   //去除符号
        return removeSymbol(word, "");
    }

    public static String removeSymbol(String word, String replaceString){   //去除符号
        String regEx="[`~!@#$%^&*()-_+=|\\{}':;',//[//].<>/?~！@#￥%……&*（）—+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(word);
        return m.replaceAll(replaceString).trim();
    }
}

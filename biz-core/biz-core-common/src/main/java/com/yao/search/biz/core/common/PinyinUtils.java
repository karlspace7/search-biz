package com.yao.search.biz.core.common;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * Created by karls_000 on 15-8-5.
 */
public class PinyinUtils
{
    public static String toPinyin(String str)
    {
        return toPinyin(str, " ");
    }

    public static String toPinyin(String str, String replaceStr)
    {
        if(str == null)
            return "";

        HanyuPinyinOutputFormat hanYuPinOutputFormat = new HanyuPinyinOutputFormat();

        hanYuPinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanYuPinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        hanYuPinOutputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);

        StringBuffer sb = new StringBuffer();
        for(char c : str.toCharArray())
        {
            try
            {
                if (c == '_' || c == '-')
                    c = '+';
                else if (c == ',')
                    c = '\'';
                String[] pinyins = PinyinHelper.toHanyuPinyinStringArray(c, hanYuPinOutputFormat);
                if(pinyins != null)
                    sb.append(pinyins[0] + replaceStr);
                else
                    sb.append(c);
            }
            catch (BadHanyuPinyinOutputFormatCombination e)
            {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}

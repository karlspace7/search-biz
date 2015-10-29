package com.yao.search.biz.core;

/**
 * 这个异常类表示在对es源数据进行json转换时发生的运行时异常
 * 这个异常主要是由{@link org.codehaus.jackson.map.ObjectMapper#readValue(byte[], Class)}方法引起的

 */
public class ProductJsonConvertException extends RuntimeException {


    private static final long serialVersionUID = 1L;

    /**
     * 构造方法
     *
     * @param msg   msg异常消息
     * @param rason rason异常的原因
     */
    public ProductJsonConvertException(String msg, Exception rason) {
        super(msg, rason);
    }

}

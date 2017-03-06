package com.sailfish.common;

/**
 * @author sailfish
 * @create 2017-03-06-下午8:33
 */
public interface   DTOConvert<S, T>{

    /**
     * 将S转为T
     * @param s
     * @return
     */
    T convert(S s);
}

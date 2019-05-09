package com.springboot.chapter4.intercept;


import com.springboot.chapter4.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {
    // 事前方法
    boolean before();

    // 事后方法
    void after();

    Object around(Invocation invocation)
            throws InvocationTargetException, IllegalAccessException;

    // 事后返回方法 如果没有发生异常执行
    void afterReturning();

    // 事后返回方法 如果有发生异常执行
    void afterThrowing();

    // 是否使用around方法取代原方法
    boolean useAround();

}

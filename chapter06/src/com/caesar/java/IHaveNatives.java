package com.caesar.java;

/**
 * @author Nicolas Caesar
 * <p>
 * java需要调用系统的线程，所系需要调用c++实现的Native Method
 * <p>
 * 标识符native可以与所有其他的java标识符连用，但是abstract（没有方法体）除外
 *
 * 为什么要是用Native Method?
 * java是用起来非常方便，然而有些层次的任务用java实现起来不容易，或者我们对程序的效率很在意的时候
 * java需要与一些底层系统，，如操作系统或者某些硬件交换信息时候，本地方法就是一个这样的交流机制
 * 它为我们提供了一个非常简洁的接口，而且我们无需去了解java应用之外的繁琐的细节。
 *
 */
public class IHaveNatives {

public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] array) throws Exception;
}

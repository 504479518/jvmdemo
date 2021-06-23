package com.caesar.java;

/**
 * 方法区在哪里？
 * java虚拟机规范中说明：尽管所有的方法区在逻辑上是属于堆的一部分，但是一些简单的实现可能不会选择去进行垃圾收集或者进行压缩。
 * 对于HotSpotJVM而言，方法区还要一个别名叫做Non-Heap（非堆），目的就是要和堆分开。
 * <p>
 * 所以，方法区看做是一块独立于java堆的内存空间。
 *
 * 方法区的基本理解
 * 方法区（Method Area）与java堆一样，是个个线程共享的内存区域
 *
 * @author qings
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}

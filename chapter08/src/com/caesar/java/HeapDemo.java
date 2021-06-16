package com.caesar.java;

/**
 * @author Nicolas Caesar
 * 堆核心概述：
 * 1.一个进程对应一个jvm实例，每一个jvm实例都有一个运行时数据区，各个线程之间共享堆与方法区；
 * 2.每一个线程有自己独立的程序计数器，本地方法区
 *
 * 一个JVM实例只存在一个堆内存，堆也是java内存管理的核心区域。
 * java堆区在jvm启动的时候即被创建，其空间大小也是确定的。是JVM管理的最大一块内存空间。（堆内存的大小是可以调节的）
 *
 * java虚拟机规范规定，堆可以处于物理上不连续的内存空间上，但在逻辑上它应该被视为连续的。
 *
 * 所有的线程共享java堆，在这里还可以划分线程私有的缓冲区（thread local allocation buffer ，TLAB）
 *
 * 设置堆空间
 * -Xms10m -Xmx10m
 *
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start。。。。。。。");
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end。。。。。。。。");
    }
}

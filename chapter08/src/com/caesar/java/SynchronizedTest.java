package com.caesar.java;

/**
 * 逃逸分析：同步省略
 * 如果一个对象被发现只能从一个线程被访问到，那么对于这个对象的操作可以不考虑同步。
 * <p>
 * 线程同步的代价是相当高的，同步的结果是降低并发性和性能。
 * <p>
 * 在动态编译同步块的时候，JIT编译器可以借助逃逸分析来判断同步块所使用的锁对象是否只能被一个线程访问。
 * 如果没有，那么JIT编译器再编译这个同步块的时候就会取消对这部分代码的同步。这样就能大大提高并发性和性能。
 * 这个取消同步的过程就叫同步省略，也叫锁消除。
 *
 * @author Nicolas Caesar
 */
public class SynchronizedTest {

    public void f() {
        Object hollis = new Object();
        synchronized (hollis) {
            System.out.println(hollis);
        }
    }
}

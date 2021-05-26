package com.caesar.java;

/**
 * @author Honey_Caesar
 * <p>
 * JVM必须保证一个类的<clinit>()方法在多线程下被同步加锁。
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread thread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };

        Thread thread1 = new Thread(r, "线程1");
        Thread thread2 = new Thread(r, "线程2");
        thread1.start();
        thread2.start();

        /**
         * 输出结果：
         * 线程1开始
         * 线程2开始
         * 线程1初始化当前类
         */
    }

    static class DeadThread {
        static {
            if (true) {
                System.out.println(Thread.currentThread().getName() + "初始化当前类");
                while (true) {

                }
            }
        }
    }
}

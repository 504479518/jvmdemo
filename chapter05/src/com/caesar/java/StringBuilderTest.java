package com.caesar.java;

/**
 * @author Nicolas Caesar
 * 面试中定义的局部变量是否线程安全？具体情况具体分析
 */
public class StringBuilderTest {

    public static void method1() {
        //StringBuffer:线程安全：操作方法是用synchronized
        //StringBuilder:线程不安全
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        //.......
    }

    //StringBuilder:线程不安全:参数可能被多个线程调用
    public static void method2(StringBuilder stringBuilder) {
        stringBuilder.append("a");
        stringBuilder.append("b");
        //.......
    }

    //stringBuilder：线程不安全：返回的变量可能会被多个线程抢占使用
    public static StringBuilder method3() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        return stringBuilder;
    }

    /**
     * stringBuilder.toString()可能会被多个线程抢占使用，但是stringBuilder:线程安全的
     */
    public static String method4() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        //主线程与新开的线程并发执行，同时操作局部变量StringBuilder会有线程安全问题
        StringBuilder stringBuilder = new StringBuilder();
        new Thread(() -> {
            stringBuilder.append("a");
            stringBuilder.append("b");

        }).start();

        method2(stringBuilder);
    }

}

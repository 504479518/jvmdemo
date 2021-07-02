package com.caesar.java;

/**
 * @author Nicolas Caesar
 * 测试设置方法区大小参数的默认值
 *
 * 设置堆空间内存不会影响方法区内存大小
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start....");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end....");
    }
}

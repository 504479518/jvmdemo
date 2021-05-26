package com.caesar.java;

/**
 * 设置栈内存大小
 * 设置参数-Xss选项来设置线程的最大栈空间，栈的大小直接决定函数调用的最大可达深度
 *
 * 类运行-》修改运行配置-》程序参数中设置：-Xss256k count：2456
 *
 * 设置的栈内存越大，报异常越晚
 */
public class StackDeepTest {
    private static int count = 0;

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }
}

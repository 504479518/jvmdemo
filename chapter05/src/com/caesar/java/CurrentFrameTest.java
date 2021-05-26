package com.caesar.java;

public class CurrentFrameTest {
    public static void main(String[] args) {
        new CurrentFrameTest().methodA();
    }

    public void methodA() {
        System.out.println("当前栈帧对应的方法-> methodA()");
        methodB();
        System.out.println("当前栈帧对应的方法-> methodA()");
    }

    public void methodB() {
        System.out.println("当前栈帧对应的方法-> methodB()");
    }
}

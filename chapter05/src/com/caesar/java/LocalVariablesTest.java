package com.caesar.java;

import java.util.Date;

/**
 * 局部变量表
 *  方法嵌套调用的次数由栈的大小决定，一般来说，栈越大，方法嵌套调用次数越多。
 *  局部变量表中的变量只在当前方法调用中有效。方法执行时，虚拟机通过使用局部变量表完成参数值到参数变量的列表的传递过程。
 *  当方法调用结束后，随着方法栈帧的销毁，局部变量表也会随之销毁。
 *
 * Slot介绍
 * 参数值的存放总是在局部变量数组的index()开始，到数组长度-1的索引结束。
 * 局部变量表，最基本的存储单元是Solt（变量槽）
 *
 * 局部变量表中存放编译器可知的各种基本数据类型（8种->boolean，char，byte，short，int，long，float，double），引用类型（reference），returnAddress类型的变量。
 *
 * 局部变量表中，32位以内的类型只占用一个slot，64位的类型（long或者double）占用两个slot。
 */
public class LocalVariablesTest {

    private int count = 0;

    public static void main(String[] args) {

        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public void test1() {
        Date date = new Date();
        String name1 = "www.loneliness.xin";
    }

    public String test2(Date date, String name2) {
        date = null;
        name2 = "天才小熊猫";
        double weight = 130.5;
        char gender = '男';
        return date + name2;
    }

}

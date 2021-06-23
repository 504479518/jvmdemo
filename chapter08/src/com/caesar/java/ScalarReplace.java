package com.caesar.java;

/**
 *
 * 逃逸分析：标量替换或者分离对象
 *
 * 有的对象可能不需要作为一个连续的内存结构存在也可以被访问到，
 * 那么对象的部分（或者全部）可以不存在内存，
 * 而是存储再CPU寄存器中。
 *
 * 标量（Scalar）是指一个无法再分解成更小的数据的数据。
 * java中的原始数据类型就是标量。
 *
 * 相对的，那些还可以分解的数据叫做聚合量(aggregate)，java中的对象就是聚合量，
 *
 * 在JIT阶段，如果经过逃逸分析，发现一个对象不会被外界访问的话，
 * 那么经过JIT优化，就会把这个对象拆解成若干个其中包含的若干个成员变量来代替。
 * 这个过程就是标量替换
 *
 *
 * 标量替换参数设置：
 * 参数-XX：+EliminateAllocations    :开启标量替换（默认打开），允许将对象打散分配在栈上。
 *
 * -Xms100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX：+EliminateAllocations
 * @author Nicolas Caesar
 */
public class ScalarReplace {

    public static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        User user = new User();
        user.id = 5;
        user.name = "我是尼古拉斯 凯撒";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间为：" + (end - start));
    }
}

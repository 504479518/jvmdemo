package com.caesar;

/**
 * @author Honey_Caesar
 */
public class ClintTest {
    /**
     * 任何一个类的声明以后，内部至少存在一个类的构造器：
     * 1.没有构造方法的话，默认空参构造方法（隐式）
     * 2.有构造方法的话会有两个构造器
     * <p>
     * 初始化：
     * 1.这个初始化是类的初始化，不是实例的初始化。
     * 2.为类的静态变量赋予正确的初始值。为新的对象分配内存，为实例变量赋默认值，为实例变量赋正确的初始值。
     * 3.初始化阶段就是指向类构造器方法<clinit>()【意思是class init】的过程，此方法不需定义，是javac编译器自动收集类中的所有类变量的赋值动作和静态代码块中的语句合并而来。
     * 4.<clinit>()不同于类的构造器，若该类具有父类，JVM会保证子类的<clinit>执行前，父类的<clinit>已经执行完毕。
     * 5.JVM必须保证一个类的<clinit>()方法在多线程下被同步加锁。
     */
    private int a = 1;
    private static int c = 2;

    public static void main(String[] args) {
        int b = 2;
    }

    public ClintTest() {
        a = 10;
        int d = 30;
    }
}

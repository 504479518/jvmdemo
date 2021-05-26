package com.caesar;

/**
 * @author Honey_Caesar
 */
public class ClassInitTest {

    /**
     * 类加载器的初始化：
     *      这个初始化是类的初始化，不是实例的初始化。
     *      为类的静态变量赋予正确的初始值。为新的对象分配内存，为实例变量赋默认值，为实例变量赋正确的初始值。
     *      初始化阶段就是指向类构造器方法<clinit>()【意思是class init】的过程，此方法不需定义，是javac编译器自动收集类中的所有类变量的赋值动作和静态代码块中的语句合并而来。
     *      <clinit>()不同于类的构造器，若该类具有父类，JVM会保证子类的<clinit>执行前，父类的<clinit>已经执行完毕。JVM必须保证一个类的<clinit>()方法在多线程下被同步加锁。
     */
    private static int num = 1;

    static {
        num = 2;
        System.out.println(num);
        number = 20;
        //报错：非法前向引用
        //System.out.println(number);
    }

    private static int number = 10;

    public static void main(String[] args) {
        /**
         * 。。。。
         * Methods
         *      --[0]<init>
         *      --[1]main
         *      --[2]<clinit> ->classInitial
         *          --[0]Code ->> iconst_1
         *                        putstatic #3<ClassInitTest全限定名.num>
         *                        iconst_2
         *                        putstatic #3<ClassInitTest全限定名.num>
         *                        bipush 20
         *                        putstatic #5<ClassInitTest全限定名.number>
         *                        bipush 10
         *                        putstatic #5<ClassInitTest全限定名.number>
         */
        // linking之prepare:number = > 0  ---> initial: 1 -> 2
        System.out.println(ClassInitTest.num);
        // linking之prepare:number = > 0  ---> initial: 20 -> 10
        System.out.println(ClassInitTest.number);
    }
}

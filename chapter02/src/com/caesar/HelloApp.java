package com.caesar;

public class HelloApp {
    /**
     *类加载器的准备阶段：
     *  为类变量分配内存并且设置该类变量为默认初始值，即：零值。
     *   这里不包含final修饰的static，因为final在编译的时候就会分配内存，准备阶段只是显示初始化。
     *   这里不会为实例变量分配初始化，类变量会分配到方法区，而实例变量会随着对象一起分配到到java堆中。
     * 类加载器的准备阶段prepare(a  =  0) ---> initial (a  =  1)
     */
    private static int a = 1;
    private static long b;

    static {
        b = 2;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}

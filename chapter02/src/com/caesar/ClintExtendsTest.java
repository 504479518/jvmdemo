package com.caesar;

/**
 * @author Honey_Caesar
 *
 * <clinit>()不同于类的构造器，若该类具有父类，JVM会保证子类的<clinit>执行前，父类的<clinit>已经执行完毕。
 */
public class ClintExtendsTest {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        //加载Father完成后，继而加载Son类
        //2
        System.out.println(Son.B);
    }
}

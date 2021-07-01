package com.caesar.java;

/**
 * @author qings
 * 静态引用对应的对象实体始终都存在堆空间
 * jdk1.7
 * -Xms200m -Xmx200m -XX:PremSize=300m -XX:MaxPermSize=300m -XX:PrintGCDetails
 * <p>
 * jdk1.8
 * -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:PrintGCDetails
 */
public class StaticFieldTest {

    private static Byte[] arr = new Byte[1024 * 1024 * 100];

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

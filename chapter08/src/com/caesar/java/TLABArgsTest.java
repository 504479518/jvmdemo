package com.caesar.java;

/**
 * @author Nicolas Caesar
 * <p>
 * 测试-XX:UseTLAB参数是否开启的情况
 *
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("我是来打酱油的");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

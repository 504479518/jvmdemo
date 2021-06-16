package com.caesar.java;

/**
 * @author Nicolas Caesar
 * <p>
 * -Xms20m -Xmx20m
 */
public class HeapDemoCopy {
    public static void main(String[] args) {
        System.out.println("start。。。。。。。");
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end。。。。。。。。");
    }
}

package com.caesar.java;

/**
 * @author Nicolas Caesar
 * 测试：大对象直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:survivorRatio=8 -XX:+PrintGCDetails
 */
public class YoungOldAreaTest {

    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20];//20M
    }
}

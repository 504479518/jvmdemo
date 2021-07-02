package com.caesar.java;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author Administrator
 * <p>
 * 设置直接内存大小（默认与堆的最大值已知）
 * -Xmx20m -XX:MaxDirectMemorySize=10m
 */
public class MaxDirectMemorySizeTest {
    private static final long _1M = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field declaredField = Unsafe.class.getDeclaredFields()[0];
        declaredField.setAccessible(true);
        Unsafe unsafe = (Unsafe) declaredField.get(null);
        while (true) {
            unsafe.allocateMemory(_1M);
        }
    }
}

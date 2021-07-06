package com.caesar.java;

/**
 * @author Administrator
 * 测试解释器模式和JIT编译模式
 * -Xint:6520ms
 * -Xcomp:950ms
 * -Xmixed:936ms
 *
 */
public class IntCompTest {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        testPrimeNumber(1000000);
        long endTime = System.currentTimeMillis();
        System.out.println("花费时间：" + (endTime - startTime));
    }

    private static void testPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            //计算100以内的质数
            label:
            for (int j = 2; j < 100; j++) {
                for (int k = 2; k < Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
        }
    }
}

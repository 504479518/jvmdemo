package com.caesar.java;

/**
 * 逃逸分析：栈上分配测试
 * <p>
 * -Xms1G -Xmx1G  -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        // 查询执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为" + (end - start) + "ms");
        // 为了方便查看堆内存中对象个数，线程heap、
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 未发生逃逸分析（通过VM参数配置打开或者关闭逃逸分析,未发生逃逸分析的速度快，并且不发生GC）
     */
    private static void alloc() {
        User user = new User();
    }

    static class User {
    }
}

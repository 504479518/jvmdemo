package com.caesar.java;

/**
 * * 栈上分配，标量替换
 * <p>
 * 示例代码调用了1亿次alloc()，如果是分配到堆上，大概需要1GB以上堆空间，如果堆空间小于该值，必然会触发GC。
 * <p>
 * 使用如下参数不会发生GC
 * -Xmx15m -Xms15m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 * <p>
 * 使用如下参数都会发生大量GC
 * -Xmx15m -Xms15m -XX:-DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 * -Xmx15m -Xms15m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 */
public class AllocationOnThreadStackTest {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        allocate();
        System.out.println("cost:" + (System.currentTimeMillis() - begin));
    }


    private static void allocate() throws InterruptedException {
        for (int i = 0; i < 100000000; i++) {
            Artisan artisan = new Artisan();
            artisan.setId(1);
            artisan.setDesc("artisan");
        }
    }
}

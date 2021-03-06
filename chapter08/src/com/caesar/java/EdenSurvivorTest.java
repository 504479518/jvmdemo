package com.caesar.java;

/**
 * @author Nicolas Caesar
 * 1.设置堆初始内存与最大内存
 * -Xms600m -Xmx600m
 * <p>
 * 2.-XX:-NewRatio:设置新生代与老年代的比例。默认值是2；
 * <p>
 * 3.-XX:SurvivorRatio:设置新生代中eden区与SurvivorRatio区的比例
 * <p>
 * 4.-XX:-UseAdaptivesSizePolicy 在vm参数中关闭自适应内存分配策略（暂时用不到减号为关闭，加号为启用）
 * <p>
 * 5.-Xmn：设置新生代的最大内存大小（比例与内存空间全部设置以该参数为准，一般不设置）
 * 6.对象分配过程总结
 *   a：针对幸存者s0，s1区的总结：复制之后有交换，谁空谁是to
 *   b:关于垃圾回收：频繁的在新生代收集，很少在老年代收集，几乎不在永久区/元空间收集
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我是个打酱油的........");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

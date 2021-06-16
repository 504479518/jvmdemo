package com.caesar.java;

/**
 * @author Nicolas Caesar
 * <p>
 * 堆的核心概念
 * <p>
 * 1.《java虚拟机规范》中对java堆的描述：所有的对象实例以及数组都应该在运行时放在堆上。
 * 2.数组和对象可能永远不会存储在栈上，因为栈帧中保存引用，这个引用指向对象或者数组在堆中的位置。
 * 3.在方法结束后，堆中的对象不会马上被移除，仅仅在垃圾收集的时候才会被移除。
 * 4.堆，GC（Grabage Collection，垃圾回收器）执行垃圾回收的重点区域
 */
public class SimpleHeap {
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap heap1 = new SimpleHeap(1);
        SimpleHeap heap2 = new SimpleHeap(2);

        int[] arr = new int[10];
        Object[] arr1 = new Object[10];
    }
}

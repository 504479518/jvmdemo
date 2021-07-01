package com.caesar.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * 演示对象的分配过程
 *-Xms100m -Xmx100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 *
 *
 * @author Nicolas Caesar
 * -Xms600m -Xmx600M
 */
public class HeapInstanceTest {

    byte[] buffer = new byte[new Random().nextInt(1024 * 1024)];

    public static void main(String[] args) {
        int  i = 0;
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (i<=1000) {
            i = i+1;
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

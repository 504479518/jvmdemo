package com.caesar.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * 演示对象的分配过程
 *
 * @author Nicolas Caesar
 * -Xms600m -Xmx600M
 */
public class HeapInstanceTest {

    byte[] buffer = new byte[new Random().nextInt(1024 * 1024)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

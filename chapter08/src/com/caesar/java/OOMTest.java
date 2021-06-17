package com.caesar.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Nicolas Caesar
 * 设置堆空间大小
 * -Xms600m -Xmx600m
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            arrayList.add(new Pricture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Pricture {

    private byte[] pixels;

    public Pricture(int length) {
        this.pixels = new byte[length];
    }
}

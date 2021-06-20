package com.caesar.java;

import java.util.ArrayList;

/**
 * @author Nicolas Caesar
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            ArrayList<String> list = new ArrayList<>();
            String a = "Nicolas Caesar";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("遍历次数为：" + i);
        }
    }
}

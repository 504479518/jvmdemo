package com.caesar.java;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * @author Nicolas Caesar
 * <p>
 * 返回地址指令包含ireturn(当返回值是boolean、byte、char、short和int类型时使用)、
 * lreturn、freturn、dreturn以及areturn，另外还有一个return指令供声明为void方法、
 * 实例初始化方法、类和接口的初始化方法使用。
 */
public class RReturnAddressTest {

    public boolean methodBoolean() {
        return false;
    }

    public byte methodByte() {
        return 0;
    }

    public short methodShort() {
        return 0;
    }

    public char methodChar() {
        return 'a';
    }

    public int methodInt() {
        return 0;
    }

    public long methodLong() {
        return 0;
    }

    public float methodFloat() {
        return 0.0f;
    }

    public double methodDouble() {
        return 0.00;
    }

    public String methodString() {
        return null;
    }

    public Date methodDate() {
        return null;
    }

    public void methodVoid() {

    }

    static {
        int i = 10;
    }

    public void method1() throws IOException {
        FileReader fis = new FileReader("caesar.txt");
        char[] cBuffer = new char[1024];
        int len;
        while ((len = fis.read(cBuffer)) != -1) {
            String str = new String(cBuffer, 0, len);
            System.out.println(str);
        }
        fis.close();
    }

    public void method2() {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.caesar.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author qings
 */
public class Demo {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\gyf\\Desktop\\JVM教材.zip");
            fileOutputStream = new FileOutputStream("./test11.zip");
            byte[] data = new byte[1024 * 1024];
            int read = fileInputStream.read(data);
            while (((read) != -1)) {
                int slot_2 = 200;
                System.out.println("slot_2 = " + slot_2);
                fileOutputStream.write(data, 0, read);
            }
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.caesar.java;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @author Administrator
 * <p>
 * IO                NIO(New IO/ Non-Blocking IO)
 * byte[]/char[]     Buffer
 * Stream            Channel
 * <p>
 * 查看直接内存的占用与释放
 */
public class BufferTest {
    //1G
    private static final int BUFFER = 1024 * 1024 * 1024;

    public static void main(String[] args) {
        //直接分配本地内存空间
        ByteBuffer buffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕，请求指示；");

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        System.out.println("直接内存开始释放！");
        buffer = null;
        System.gc();

        scanner.nextInt();
    }

}

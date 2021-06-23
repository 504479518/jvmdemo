package com.caesar.java;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        ClassLoader myLoad = new ClassLoader() {

            @Override
            public Class<?> loadClass(String name)throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".")+1)+".class";
                InputStream is = getClass().getResourceAsStream(fileName);
                if (null == is) {
                    return super.loadClass(name);
                }
                try {
                    byte[] b= new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException();
                }

            }
        };

        try {
            Object obj = myLoad.loadClass("java.lang.String").newInstance();
            System.out.println(obj.getClass());
            // 这个obj使用的是自定义的classLoad 与 虚拟机自带的不是一个类加载器，所以返回false
            System.out.println(obj instanceof ClassLoaderTest);
            System.out.println();
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

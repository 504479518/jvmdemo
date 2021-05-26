package com.caesar.java;

import java.sql.Driver;
import java.sql.DriverManager;

public class ClassLoaderInfo extends ClassLoader {
    /**
     * ClassLoader类，一个抽象类，其后所有的类加载器都继承自ClassLoader（不包括启动类加载器）
     * 常用的方法
     * getParent(); 返回该类加载器的超类加载器
     * findClass(""); 加载名称为name的类，返回结果为java.lang.Class类的实例
     * findLoadedClass("");查找名称为name的已经被加载过的java类，返回结果为java.lang.Class类的实例
     * defineClass(String name,byte[] b,int off, int len); 把字节数组b中的内容转换为一个java类，返回结果为java.lang.Class类的实例
     * resolveClass(Class<?> c);连接指定的一个java类
     *
     * 2.关于classLoader
     * sun.misc.Launcher 它是java虚拟机的入口应用
     * ExtClassLoader extends URLClassLoader
     *                        URLClassLoader extends SecureClassLoader implements Closeable
     * AppClassLoader extends URLClassLoader
     *                                               SecureClassLoader extends ClassLoader
     *
     *3.获取classLoader
     *方式一：获取当前类的classLoader
     *      Class.forName("java.lang.String").getClassLoader();
     *方式二：获取当前线程上下文的ClassLoader
     *      Thread.currentThread().getContextClassLoader();
     *方式三：获取系统的ClassLoader
     *      ClassLoader.getSystemClassLoader();
     *
     */
    public static void main(String[] args) {
        // todo getParent(); 返回该类加载器的超类加载器
        //ClassLoader parent = new com.caesar.java.ClassLoaderInfo().getParent(); 返回该类加载器的超类加载器

        //todo findClass("");加载名称为name的类，返回结果为java.lang.Class类的实例
        //new com.caesar.java.ClassLoaderInfo().findClass("");

        //todo findLoadedClass("");查找名称为name的已经被加载过的java类，返回结果为java.lang.Class类的实例
        //Class<?> loadedClass = new com.caesar.java.ClassLoaderInfo().findLoadedClass("");

        //todo defineClass(String name,byte[] b,int off, int len); 把字节数组b中的内容转换为一个java类，返回结果为java.lang.Class类的实例
        //new com.caesar.java.ClassLoaderInfo().defineClass(String name,byte[] b,int off, int len);

        //todo resolveClass(Class<?> c);连接指定的一个java类
        //new com.caesar.java.ClassLoaderInfo().resolveClass(Class<?> c);
    }
}

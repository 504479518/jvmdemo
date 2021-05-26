package com.caesar;

/**
 * @author honey_caesar
 */
public class ClassLoaderWork {
    /**
     * 双亲委派模式
     * <p>
     * Java虚拟机对Class文件采用的是按需加载，而且加载class文件时，Java虚拟机使用的是双亲委派模式，即把请求交由父类处理，它是异种任务委派模式
     * 1、如果一个类加载器收到了类加载请求，它并不会自己先去加载。而是把这个请求委托给父类的加载器去执行
     * 2、如果父类加载器还存在其父类加载器，则进一步向上委托，依次递归，请求最终将达到顶层的启动类加载器
     * 3、如果父类的加载器可以完成类加载任务，就成功返回，倘若父类加载器无法完成此加载任务，子加载器才会尝试自己去加载，这就是双亲委派模式
     * <p>
     * 优势： a.避免类的重复加载 b.保护程序安全，防止核心API被篡改
     * 沙箱安全机制：保证对Java核心源代码的保护
     * 自定义String类，但是在加载自定义String类的时候回率先使用引导类加载器加载，
     * 而引导类加载器再加载的过程中会先加载jdk自带的文件（rt.jar包中的java\lang\String.class）
     * 报错信息说没有main方法就是因为加载的是rt.jar包中的String类。
     * 这样可以保证对java核心源代码的保护
     */
    public static void main(String[] args) {
        String string = new java.lang.String();
        System.out.println("hello ,honey_caesar");
    }

}

/**
 * 虚拟机自带的加载器
 *  启动类加载器（BootStrap ClassLoader）
 *      1.这个类是使用c/c++语言实现的，嵌套再JVM内部
 *      2.它用来加载java的核心库（JAVA_HOME/jre/lib/rt.jar、resources.jar或sun.boot.class.path路径下的内容），用于提供JVM自身需要的类
 *      3.并不继承自java.lang.ClassLoader,没有父类
 *      4.加载扩展类和应用程序类加载器，并制定他们的父类加载器
 *      5.出于安全考虑，bootstrap启动类加载器只是加载java、javax、sun等开头的类
 *   扩展类加载器（Extension ClassLoader）
 *      1.java语言编写，sun.misc.Launcher$ExtClassLoader实现。
 *      2.派生于ClassLoader
 *      3.父类加载器为启动类加载器
 *      4.从java.ext.dirs系统属性所指定的目录加载类库，或者从JDK的安装目录jre/lib/ext子目录下加载类库。
 *      5.如果用户创建的jar放在此目录下，也会自动由扩展类加载器加载
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取systemClassLoader上层：扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);
        //sun.misc.Launcher$ExtClassLoader@4554617c

        //获取extClassLoader上层:引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);
        //null

        //对于用户自定义的类来说：默认使用系统类加载器加载---》java的核心类库都是使用引导类加载器进行加载的
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        //sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}

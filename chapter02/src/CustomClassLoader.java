import java.io.FileNotFoundException;

/**
 * @author Honey_caesar
 * 自定义用户类加载器
 * 为什么自定义类加载器
 * 1.隔离加载类（解决框架的jar依赖冲突）
 * 2.修改类加载的方式
 * 3.扩展加载源
 * 4.防止源码泄漏
 * 用户自定义类加载器实现步骤：
 * 1.开发人员可以通过继承抽象类java.lang.ClassLoader类的方式，实现自己的类加载器，满足一些特定的需求。
 * 2.在JDK1.2之前，在自定义加载器时，总会去继承ClassLoader类并重写loadeClass（）方法，从而实现自定义的类加载类，
 * 但是从JDK1.2之后不用去覆盖loadClass（）方法，建议把自定义的类加载逻辑写在findClass()方法中。
 * 3.编写自定义加载器时，如果没有过于复杂的需求，可以直接继承URLClassLoader类，这样就可以避免自己去编写findClass（）方法
 * 获取字节码流的方式，使自定义类加载器编写更加简洁
 */
public class CustomClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException("");
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFromCustomPath(String name) {
        //todo 从自定义路径加载指定类：细节略
        //todo 如果指定路径的字节码文件进行了加密，则需要你在此方法中进行解密操作
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, customClassLoader);
            Object object = clazz.newInstance();
            System.out.println(object.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

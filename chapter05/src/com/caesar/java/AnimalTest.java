package com.caesar.java;

/**
 * 方法的调用
 * <p>
 * 在JVM中，将符号应用转换成调用方法的直接引用与方法的绑定机制有关。
 * <p>
 * 1.静态链接
 * 当一个字节码文件被装载到JVM内部时，如果被调用的方法在编译期可知，且运行期间保持不变。
 * 这种情况下将调用方法的符号引用转换为直接引用的过程称之为静态链接。
 * 2.动态链接
 * 如果被调用的方法在编译期无法被确定下来，也就是说，只能够在程序运行期将调用方法的符号引用转换成直接引用，
 * 由于这种尹艳红转换过程具备动态性，因此被称之为动态链接。
 * <p>
 * 对应的方法的绑定机制为：早期绑定和晚期绑定。
 * 绑定是一个字段、方法或者类在符号引用被替换为直接引用的过程，这仅仅发生一次。
 * 1.早期绑定：
 * 早期绑定指被调用的目标方法如果再编译期可知，且运行期保持不变时，
 * 即可将这个方法与所属的类型进行绑定，这样一来，由于明确了呗调用的目标方法是哪一个，因此也就可以使用静态链接的方法将符号引用转换为直接引用。
 * 2.晚期绑定：
 * 如果被调用的方法再编译期无法被确定下来，只能够在程序运行期根据实际的类型绑定相关的方法，这种绑定方式被称之为晚期绑定。
 * <p>
 * 明显的区分：
 * 早起绑定：方法调用父类中的方法（super.eat();），或者(this.eat();)
 * 参数是一个类或者一个接口类型（传入的是实例化的类-编译期无法确定，接口参数无法实例化更是晚期绑定）
 *
 * @author Nolas Caesar
 */
class Animal {
    public void eat() {
        System.out.println("动物进食");
    }
}

interface Huntable {
    void hunt();
}

class Dog extends Animal implements Huntable {

    @Override
    public void eat() {
        //早起绑定
        super.eat();
        System.out.println("狗啃骨头");
    }

    @Override
    public void hunt() {
        //早起绑定
        this.hunt();
        System.out.println("狗拿耗子-多管闲事");
    }
}

class Cat extends Animal implements Huntable {

    @Override
    public void eat() {
        System.out.println("猫爱吃鱼");
    }

    @Override
    public void hunt() {
        System.out.println("猫拿耗子-天经地义");
    }
}

public class AnimalTest {

    public void showAnimal(Animal animal) {
        //晚期绑定
        animal.eat();
    }

    public void showHunt(Huntable huntable) {
        //晚期绑定
        huntable.hunt();
    }

    public static void main(String[] args) {
        //此为早期绑定
        Dog dog = new Dog();
        new AnimalTest().showAnimal(dog);
        //此为晚期绑定
        Huntable huntable = new Dog();
        new AnimalTest().showHunt(huntable);
    }
}


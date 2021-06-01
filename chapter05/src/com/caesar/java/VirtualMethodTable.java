package com.caesar.java;

/**
 * @author Nicolas Caesar
 */
interface friendly {

    void sayHello();

    void sayGoodBey();
}

class Dog1 {
    public void sayHello() {

    }

    @Override
    public String toString() {
        return "dog";
    }
}

class Cat1 implements friendly {

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodBey() {

    }

    @Override
    protected void finalize() {

    }

    @Override
    public String toString() {
        return "Cat1";
    }
}

class CockerSpaniel extends Dog1 implements friendly {

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void sayGoodBey() {
    }
}

/**
 * @author Nicolas Caesar
 */
public class VirtualMethodTable {

}

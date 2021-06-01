package com.caesar.java;

/**
 * 体会invokedynamic指令
 *
 * @author Nicolas Caesar
 */
@FunctionalInterface
interface Func {
    /**
     * @param string 接口参数
     */
    public boolean func(String string);
}


/**
 * @author Nicolas Caesar
 */
public class Lambda {

    public void lambda(Func func) {

    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = string -> {
            return true;
        };
        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }


}

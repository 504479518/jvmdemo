package com.caesar.java;

/**
 * @author qings
 *
 * 测试对象实例化的过程
 * 1.加载类元信息
 * 2.为对象分配内存
 * 3.处理并发问题
 * 4.属性的默认初始化（类型初始化 ，各个类型所对应的默认值eg：int i=0；）
 * 5.设置对象头信息
 * 6.属性的显示初始化、代码块中初始化、构造器中初始化
 *
 *
 *
 * 给对象的属性赋值的操作
 * 1.属性的默认初始化例如int = 0 2.显示初始化（int id = 1001;）  3.代码块中初始化（2和3取决于代码书写顺序）  4.构造器初始化
 */
public class Customer {
    int id = 1001;
    String name;
    Accounts acct;

    public Customer() {
        acct = new Accounts();

    }

    private class Accounts {
    }
}

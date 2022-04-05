package com.hspedu.poly_.dynamic;

public class A {
    // java 的动态绑定机制
    // 1.当调用动态方法的时候，该方法会和该对象的内存地址/运行类型绑定
    // 2.当调用对象属性时，没有动态绑定机制，哪里声明哪里使用

    public int i = 10;
    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}

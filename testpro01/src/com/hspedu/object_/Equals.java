package com.hspedu.object_;

public class Equals {
    public static void main(String[] args) {
        // == 可以比较基本类型值，也可以比较 引用类型值
        A a = new A();
        A b = a ;
        A c = b ;
        System.out.println(a == b);
        System.out.println(b == c);
        B bObj = a;
        System.out.println(bObj == c);

        //equals: 是Object 类中的方法，只能判断引用类型，
//       默认判断的是地址是否相等，子类中往往重写此方法，用于判断内容是否相等，
        "hello".equals("abs");
    }
}
class B{}
class A extends B{}

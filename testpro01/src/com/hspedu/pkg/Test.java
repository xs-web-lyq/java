package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问public修饰的
        System.out.println(a.n1);
    }
}

package com.hspedu.poly_detail;

public class PolyDetail {
    public static void main(String[] args) {
        //属性没有重写一说！属性的值看编译类型
        Base base = new Sub();
        System.out.println(base.count);

        Sub sub = (Sub) base;
        System.out.println(sub.count);

    }
}

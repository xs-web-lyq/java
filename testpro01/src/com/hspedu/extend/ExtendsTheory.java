package com.hspedu.extend;
/*
继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        //？=>注意其返回关系，来返回数据。
        //1.首先看子类是否有该属性
        //2.如果子类有这个属性，并且可以访问，则返回信息。
        //3.如果子类没有此属性，看父类是否有此属性，（如果有并且访问则返回）
        //4.如果父类没有就按照3.的规则继续向上找父类，直到Object
        System.out.println(son.name);
        System.out.println(son.hobby);
        System.out.println(son.age);
        System.out.println(son.getAge());
    }
}
class GrandPa {//爷类
    String name = "大头爷爷";
    String hobby = "陆游";
    int age = 100;
    public int getAge(){
        return age;
    }
}
class Father extends GrandPa { //父类
    String name = "大头爸爸";
//    private int age = 39;
    public int getAge(){
        return age;
    }
}
class Son extends Father {
    String name = "大头儿子";
}

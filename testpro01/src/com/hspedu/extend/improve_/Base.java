package com.hspedu.extend.improve_;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public int callN4(){
        return n4;
    }
//    public Base(){
//        System.out.println("base()...");
//    }
    public Base(String name, int age){//有参构造器

    }
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    public void callTest400(){
        test400();
    }
}

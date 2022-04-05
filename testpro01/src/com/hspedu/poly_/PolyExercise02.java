package com.hspedu.poly_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//30
        s.display();//30
        Base b = s;
        System.out.println(b == s);//true
        System.out.println(b.count);//20
        b.display();//30
    }
}
class Base {
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }

}
class Sub extends Base{
    int count = 30;
    public void display(){
        System.out.println(this.count);
    }
}
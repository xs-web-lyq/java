package com.hspedu.poly_detail;

public class PolyDetail02 {
    public static void main(String[] args) {

        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        AA aa = new BB();
        // instanceOf 比较操作符，用于判断对象运行类型是否为XX类型或XX类型的子类型
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object object = new Object();
        System.out.println(object instanceof AA);//false

    }
}
class AA {

}
class BB extends AA {}

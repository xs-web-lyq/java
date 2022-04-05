package com.hspedu.override;

public class Animal {
    public void cry(){
        //注意事项和使用细节
        //方法重写也叫方法覆盖，需要满足下面的条件
        //1.子类方法的参数，方法名称，要和父类方法的参数，方法名称完全一致
        //2.子类方法的返回类型和父类的方法返回类型一样，或者是父类返回类型的子类
        //3.子类方法不能缩小父类方法的访问权限。
        System.out.println("animal");
    }
}

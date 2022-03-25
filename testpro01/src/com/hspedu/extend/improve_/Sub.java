package com.hspedu.extend.improve_;

public class Sub extends Base{
    public Sub(){//无参构造器
        super("liu",18);
        System.out.println("sub()...");
    }
    public Sub(String name){//有参构造器
        super("liu",18);
    }
    public void sayOk(){
        System.out.println(n1 + "" + n2 + "" + n3);
        test100();
        test200();
        test300();
        System.out.println(callN4());
        callTest400();
    }
}

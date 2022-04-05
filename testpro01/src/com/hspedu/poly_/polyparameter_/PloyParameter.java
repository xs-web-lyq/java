package com.hspedu.poly_.polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 20000);

        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(milan);

        ployParameter.testWork(tom);
        ployParameter.testWork(milan);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    //添加一个方法，testWork，如果是普通员工，则调用work方法，如果是经理，则调用manage方法
    public void  testWork(Employee e){
        if(e instanceof Worker){
            ((Worker)e).work();
        }
        else if(e instanceof  Manager) {
            ((Manager)e).manage();
        }
    }
}

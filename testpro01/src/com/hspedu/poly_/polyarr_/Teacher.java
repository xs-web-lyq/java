package com.hspedu.poly_.polyarr_;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //重新父类say()
    public String say(){
        return super.say() + "salary" + salary;
    }
    public void teach(){
        System.out.println("老师" + getName() + "在教。。。");
    }
}

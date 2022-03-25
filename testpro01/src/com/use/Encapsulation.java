package com.use;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(110);
        System.out.println(person.getAge());
        person.setJob("刘永奇");
        Person person1 = new Person("刘永奇的姓名",21,5000.0,"student");
        System.out.println( person1.getName());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;
    private String job;

    public Person(){

    }

    public Person(String name, int age, double salary, String job) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.job = job;
            setAge(age);
            setJob(job);
            setName(name);
            setSalary(salary);
    }
    public void setName(String name) {
        if(name.length() < 6 && name.length() > 2){
            this.name = name;
        }else{
            System.out.println("输入姓名不符合要求");
            this.name = "小冬瓜";
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age < 120 && age > 0){
            this.age = age;
        }else{
            System.out.println("输入年龄有误！");
        }

    }
    public int getAge() {
        return age;
    }

    public void setJob(String job) {

        this.job = job;
    }

    public String getJob(){
        return job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

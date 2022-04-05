package com.hspedu.override;

public class Person {
    private String name;
    private String age;
    public Person(String name,String age){
        this.age = age;
        this.name = name;
    }
    public String say(){
        return name + age ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

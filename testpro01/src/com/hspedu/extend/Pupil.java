package com.hspedu.extend;
//小学生->模拟小学生考试的情况
public class Pupil {
    public String name;
    public int age;
    public double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println("小学生"+name+"正在考小学数学..");

    }
    public void showInfo(){
        System.out.println("小学生名"+name+"年龄"+age+"成绩"+score);

    }
}

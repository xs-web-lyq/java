package com.hspedu.override;

public class Student extends Person{
    private int id;
    private int score;
    public Student(String name,String age,int id,int score){
        super(name,age);
        this.id = id;
        this.score = score;
    }
    public String say(){
        return id +"==="+ score +  super.say();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

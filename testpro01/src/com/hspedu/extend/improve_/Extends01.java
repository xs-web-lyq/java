package com.hspedu.extend.improve_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Graduate graduate = new Graduate();
        pupil.name = "刘永奇";
        pupil.age = 18;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        graduate.name = "王伟";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(120);
        graduate.showInfo();
    }
}

package com.hspedu.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("liu","18");
        Student student = new Student("ai","98",55,625);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}

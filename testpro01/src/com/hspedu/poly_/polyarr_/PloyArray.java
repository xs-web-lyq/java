package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("刘永奇",21,99);
        persons[2] = new Student("刘豪 ", 20 , 99);
        persons[3] = new Teacher("WANG" , 40,5000);
        persons[4] = new Teacher("liu ", 50,60000);

        for(int i = 0 ; i < persons.length;i++){
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){//判断person[i]是否为Student类或者是其子类
                ((Student)persons[i]).study();
            }
            else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }

        }
    }
}

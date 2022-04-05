package com.hspedu.extend.exercise;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC("8080", "168","555","huawei");
        NotePad notePad = new NotePad("8080", "168","555","silver");

        System.out.println(pc.getDetails());
        System.out.println(notePad.getColor());
    }
}
class Computer {
    private String CPU;
    private String storage;
    private String disk;
    public Computer(String CPU , String storage,String disk){
        this.storage = storage;
        this.CPU = CPU;
        this.disk = disk;
    }
    public String getDetails(){
        return CPU + storage + disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}
class PC extends Computer {
    private String brand;
    public PC(String CPU , String storage,String disk , String brand){
        super(CPU,storage,disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class NotePad extends Computer {
    private String color;
    public NotePad(String CPU , String storage,String disk , String color){
        super(CPU,storage,disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


package com.hspedu.encap;

public class Account {
    private String name;
    private double account;
    private String password;

    public Account(String name, double account, String password) {
        this.setAccount(account);
        this.setName(name);
        this.setPassword(password);
    }

    public Account(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len > 1 && len < 4){
            this.name = name;
        }else {
            System.out.println("姓名不符合规范");
            this.name = "小冬瓜";
        }
    }
    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        if(account > 20.0){
            this.account = account;
        }else {
            System.out.println("银行卡余额不足！！1");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else{
            System.out.println("密码不符合规范必须是六位数");
            this.password = "111111";
        }

    }
    public void getMsg() {
        System.out.println(name + account + password);
    }
}

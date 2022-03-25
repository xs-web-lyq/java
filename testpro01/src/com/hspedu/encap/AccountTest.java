package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccount(100.2);
        account.setName("刘永奇");
        account.setPassword("123456");
        System.out.println(account.getAccount());
        System.out.println(account.getName());
        System.out.println(account.getPassword());

        Account account1 = new Account("刘豪",500000000000.5,"159632");
        account1.getMsg();
    }
}

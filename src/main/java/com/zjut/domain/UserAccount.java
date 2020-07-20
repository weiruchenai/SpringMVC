package com.zjut.domain;

import java.io.Serializable;

public class UserAccount implements Serializable {
    private User user;
    private String money;
    private String account;

    public UserAccount(User user, String money, String account) {
        this.user = user;
        this.money = money;
        this.account = account;
    }

    public UserAccount() {
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public String getMoney() {
        return money;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "user=" + user +
                ", money='" + money + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}

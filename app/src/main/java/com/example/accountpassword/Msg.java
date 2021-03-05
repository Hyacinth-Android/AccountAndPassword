package com.example.accountpassword;

public class Msg {

    private int img;
    private String account;
    private String password;
    private String bind = "none";

    public Msg(String account,String password,int img){
        this.img = img;
        this.account = account;
        this.password = password;
    }
    public Msg(String account,String password,int img,String bind){
        this.img = img;
        this.account = account;
        this.password = password;
        this.bind = bind;
    }

    public int getImg() {
        return img;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getBind() {
        return bind;
    }

}

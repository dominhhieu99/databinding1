package com.example.databinding.model;

public class RegisterStep1 {
    private String title, descreption, creat, login;

    public RegisterStep1(String title, String descreption, String creat, String login) {
        this.title = title;
        this.descreption = descreption;
        this.creat = creat;
        this.login = login;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getCreat() {
        return creat;
    }

    public void setCreat(String creat) {
        this.creat = creat;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}


package com.example.hiepnk.viper.login;

/**
 * Created by hiepnk on 9/11/2017.
 */

public class User {
    private String username;
    private String passWord;

    public User(String username, String passWord) {
        this.username = username;
        this.passWord = passWord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

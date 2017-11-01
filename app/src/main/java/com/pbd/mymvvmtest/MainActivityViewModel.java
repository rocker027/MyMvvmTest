package com.pbd.mymvvmtest;

/**
 * Created by rocker on 2017/11/1.
 */

public class MainActivityViewModel {
    private String userEmail;
    private String userPassword;
    private String hintEmail;
    private String hintPassword;

    public MainActivityViewModel(String hintEmail, String hintPassword) {
        this.hintEmail = hintEmail;
        this.hintPassword = hintPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getHintEmail() {
        return hintEmail;
    }

    public void setHintEmail(String hintEmail) {
        this.hintEmail = hintEmail;
    }

    public String getHintPassword() {
        return hintPassword;
    }

    public void setHintPassword(String hintPassword) {
        this.hintPassword = hintPassword;
    }
}

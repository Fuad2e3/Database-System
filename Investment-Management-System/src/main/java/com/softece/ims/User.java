package com.softece.ims;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
    private String userName;
    private int userNumber;
    public User() {
    }
    public User(String userName, int userNumber) {
        this.userName = userName;
        this.userNumber = userNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserNumber() {
        return userNumber;
    }

}




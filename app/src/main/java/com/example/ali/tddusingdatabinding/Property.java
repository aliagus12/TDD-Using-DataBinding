package com.example.ali.tddusingdatabinding;

/**
 * Created by ali on 02/12/17.
 */

public class Property {
    String username, password;

    public Property(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

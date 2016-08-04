package com.everydots.cost.beans;

import java.util.UUID;

/**
 * 用户
 */
public class User {
    private String id;
    private String username;
    private String password;
    private boolean isRemember;

    public User() {
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsRemember() {
        return isRemember;
    }

    public void setIsRemember(boolean isRemember) {
        this.isRemember = isRemember;
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

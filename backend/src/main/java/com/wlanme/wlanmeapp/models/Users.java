package com.wlanme.wlanmeapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
    @Id
    private String id;
    private Identity identity;

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private boolean isOnLine;

    public boolean isOnLine() {
        return isOnLine;
    }

    public void setOnLine(boolean isOnLine) {
        this.isOnLine = isOnLine;
    }

    private boolean isActivated;

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String verifyAt;

    public String getVerifyAt() {
        return verifyAt;
    }

    public void setVerifyAt(String verifyAt) {
        this.verifyAt = verifyAt;
    }

    private String verifyToken;

    public String getVerifyToken() {
        return verifyToken;
    }

    public void setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
    }

    private String tokenExpiredAt;

    public String getTokenExpiredAt() {
        return tokenExpiredAt;
    }

    public void setTokenExpiredAt(String tokenExpiredAt) {
        this.tokenExpiredAt = tokenExpiredAt;
    }

    private String createdAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    private String updatedAt;

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

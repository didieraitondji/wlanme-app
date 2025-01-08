package com.wlanme.wlanmeapp.models;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
    @Id
    private String id;
    // private LocalDateTime now = LocalDateTime.now();
    // private LocalDateTime expirationTime = now.plusMinutes(10);
    // private DateTimeFormatter formater =
    // DateTimeFormatter.ofPattern("yyyy:MM:dd'T'HH:mm:ss");
    // private TokenGenerator token = new TokenGenerator();
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

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // private boolean isOnLine = false;
    private boolean isOnLine;

    public boolean isOnLine() {
        return isOnLine;
    }

    public void setOnLine(boolean isOnLine) {
        this.isOnLine = isOnLine;
    }

    // private boolean isActivated = true;
    private boolean isActivated;

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    // private String verifyAt = null;
    private String verifyAt;

    public String getVerifyAt() {
        return verifyAt;
    }

    public void setVerifyAt(String verifyAt) {
        this.verifyAt = verifyAt;
    }

    // private String verifyToken = token.generateVerificationToken();
    private String verifyToken;

    public String getVerifyToken() {
        return verifyToken;
    }

    public void setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
    }

    // private String tokenExpiredAt = expirationTime.format(formater);
    private String tokenExpiredAt;

    public String getTokenExpiredAt() {
        return tokenExpiredAt;
    }

    public void setTokenExpiredAt(String tokenExpiredAt) {
        this.tokenExpiredAt = tokenExpiredAt;
    }

    // private String createdAt = now.format(formater);
    private String createdAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    // private String updatedAt = now.format(formater);
    private String updatedAt;

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    // création du constructeur

    // public Users(Identity identity, String email, String username, String
    // password) {
    // this.identity = identity;
    // this.email = email;
    // this.username = username;
    // this.password = password;
    // }
}

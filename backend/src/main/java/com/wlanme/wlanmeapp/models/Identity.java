package com.wlanme.wlanmeapp.models;

public class Identity {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String bio;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    // constructeur de la classe
    public Identity(String fullName, String bio, String picture) {
        this.fullName = fullName;
        this.bio = (bio != null && !bio.isEmpty()) ? bio : "";
        this.picture = (picture != null && !picture.isEmpty()) ? picture : "";
    }
}

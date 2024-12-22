package com.wlanme.wlanmeapp.models;

public class Participant {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private boolean isSilent = false;

    public boolean isSilent() {
        return isSilent;
    }

    public void setSilent(boolean isSilent) {
        this.isSilent = isSilent;
    }

    private boolean isArchived = false;

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    private boolean isDelected = false;

    public boolean isDelected() {
        return isDelected;
    }

    public void setDelected(boolean isDelected) {
        this.isDelected = isDelected;
    }

    private boolean isAdmin = false;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    private boolean hasNotification = false;

    public boolean isHasNotification() {
        return hasNotification;
    }

    public void setHasNotification(boolean hasNotification) {
        this.hasNotification = hasNotification;
    }

    public Participant(String id) {
        this.id = id;
    }
}

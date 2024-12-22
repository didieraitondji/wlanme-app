package com.wlanme.wlanmeapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contacts {
    @Id
    private String id;
    private String idUser1;

    public String getIdUser1() {
        return idUser1;
    }

    public void setIdUser1(String idUser1) {
        this.idUser1 = idUser1;
    }

    private String idUser2;

    public String getIdUser2() {
        return idUser2;
    }

    public void setIdUser2(String idUser2) {
        this.idUser2 = idUser2;
    }

    private boolean isBlockedUser1;

    public boolean isBlockedUser1() {
        return isBlockedUser1;
    }

    public void setBlockedUser1(boolean isBlockedUser1) {
        this.isBlockedUser1 = isBlockedUser1;
    }

    private boolean isBlockedUser2;

    public boolean isBlockedUser2() {
        return isBlockedUser2;
    }

    public void setBlockedUser2(boolean isBlockedUser2) {
        this.isBlockedUser2 = isBlockedUser2;
    }

    private boolean isAccepted;

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
}

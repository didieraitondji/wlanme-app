package com.wlanme.wlanmeapp.models;

public class File {

    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    private String ext;

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public File(Integer size, String ext, String path) {
        this.size = size;
        this.ext = ext;
        this.path = path;
    }

}

package com.example.hotelmanagementsystem.Model;

public class roomDesign {
    private String  id, rant,text , path;

    public roomDesign() {
    }

    public roomDesign(String id, String rant, String text, String path) {
        this.id = id;
        this.rant = rant;
        this.text = text;
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRant() {
        return rant;
    }

    public void setRant(String rant) {
        this.rant = rant;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

package com.example.ccsd.Products;

import org.springframework.data.annotation.Id;

// ERROR HERE CHECK!

//new change

public class Products{
    @Id
    private String id;
    private String title;
    private String postSlug;
    private String date;
    private String status;
    private String tag;
    private String place;
    private String content;
    private byte[] image;
    private String postShortDescription;

    //Constructors
    public Products() {}

    public Products(String title, String postSlug, String date, String status, 
    String tag, String place, String content, byte[] image, String postShortDescription) {
        this.title = title;
        this.postSlug = postSlug;
        this.date = date;
        this.status = status;
        this.tag = tag;
        this.place = place;
        this.content = content;
        this.image = image;
        this.postShortDescription = postShortDescription;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostSlug() {
        return postSlug;
    }

    public void setPostSlug(String postSlug) {
        this.postSlug = postSlug;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte[] getimage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getPostShortDescription() {
        return postShortDescription;
    }

    public void setPostShortDescription(String postShortDescription) {
        this.postShortDescription = postShortDescription;
    }

}

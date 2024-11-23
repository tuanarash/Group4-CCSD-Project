package com.example.ccsd.Products;

import java.util.Date;

import org.springframework.data.annotation.Id;

// ERROR HERE CHECK!

//new change

public class Products{
    @Id
    private String id;
    private String title;
    private String PostSlug;
    private Date date;
    private String status;
    private String tag;
    private String place;
    private String content;
    private String image;
    private String postShortDescription;

    //Constructors
    public Products() {}

    public Products(String title, String PostSlug, Date date, String status, 
    String tag, String place, String content, String image, String postShortDescription) {
        this.title = title;
        this.PostSlug = PostSlug;
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
        return PostSlug;
    }

    public void setPostSlug(String PostSlug) {
        this.PostSlug = PostSlug;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public String getimage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPostShortDescription() {
        return postShortDescription;
    }

    public void setPostShortDescription(String postShortDescription) {
        this.postShortDescription = postShortDescription;
    }

}

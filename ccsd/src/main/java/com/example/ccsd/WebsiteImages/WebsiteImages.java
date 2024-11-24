package com.example.ccsd.WebsiteImages; // Import Package

import java.util.Base64;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WebsiteImages")

public class WebsiteImages {

    // Define the variables
    @Id
    private String id;
    private String place;
    private String postShortDescription;
    private String tag;
    private String title;
    private String postSlug;
    private String content;
    private String status;
    private String date;
    private byte[] image;
    private String image64String;
    
    // Constructors
    public WebsiteImages() {}

    public WebsiteImages(String place, String postShortDescription, String tag, String title, String postSlug, String content, String status, String date, byte[] image) {
        this.postShortDescription = postShortDescription;
        this.tag = tag;
        this.place = place;
        this.title = title;
        this.postSlug = postSlug;
        this.content = content;
        this.status = status;
        this.date = date;
        this.image = image;
    }

    // Getter methods (to access private fields)
    public String getId() {
        return id;
    } 

    // Setter methods (to modify private fields)
    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPostShortDescription() {
        return postShortDescription;
    }

    public void setPostShortDescription(String postShortDescription) {
        this.postShortDescription = postShortDescription;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() { 
        return date;
    }

    public void setDate(String date) { 
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageAsBase64() {
        return image != null ? Base64.getEncoder().encodeToString(image) : null;
    }
    
    // Set Base64 String
    public void setImage64String(String image64String) {
        this.image64String = image64String;
    }
    // Return Base64 String
    public String getImage64String() {
        return this.image64String;
    }

    
}
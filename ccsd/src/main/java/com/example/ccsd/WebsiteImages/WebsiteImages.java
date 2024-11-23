package com.example.ccsd.WebsiteImages;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WebsiteImages")

public class WebsiteImages {

    // Define the variables
    @Id
    private String id;
    private String image;
    private String place;
    private String postShortDescription;
    private String tag;
    private String title;
    private String postSlug;
    private String content;
    private String status;
    private LocalDateTime date;

    // Constructors
    public WebsiteImages() {}

    public WebsiteImages(String place, String postShortDescription, String tag, String title, String postSlug, String content, String status, LocalDateTime date, String image) {
        this.place = place;
        this.postShortDescription = postShortDescription;
        this.tag = tag;
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

    public String getPlace() {
        return place;
    }

    public String getPostShortDescription() {
        return postShortDescription;
    }

    public String getTag() {
        return tag;
    }

    public String getTitle() {
        return title;
    }

    public String getPostSlug() {
        return postSlug;
    }

    public String getContent() {
        return content;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getDate() {  // Return LocalDateTime
        return date;
    }

    public String getImage() {
        return image;
    }

    // Setter methods (to modify private fields)

    // Setter methods (to modify private fields)
    public void setId(String id) {
        this.id = id;
    } 

    public void setImage(String image) {  // Set image field
        this.image = image;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPostShortDescription(String postShortDescription) {
        this.postShortDescription = postShortDescription;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPostSlug(String postSlug) {
        this.postSlug = postSlug;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(LocalDateTime date) {  // Set date as LocalDateTime
        this.date = date;
    }

}
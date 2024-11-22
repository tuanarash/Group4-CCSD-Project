package com.example.ccsd.Gallery;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

// ERROR HERE CHECK!

//new change

public class Gallery{
    @Id
    private String id;
    private String galleryImageTitle;
    private String gallerySlug;
    private Date galleryDate;
    private String galleryStatus;
    private List<String> galleryTags;
    private String galleryTextPlace;
    private String galleryImageLocation;

    //Constructors
    public Gallery() {}

    public Gallery(String galleryImageTitle, String gallerySlug, Date galleryDate, String galleryStatus, 
    List<String> galleryTags, String galleryTextPlace, String galleryImageLocation) {
        this.galleryImageTitle = galleryImageTitle;
        this.gallerySlug = gallerySlug;
        this.galleryDate = galleryDate;
        this.galleryStatus = galleryStatus;
        this.galleryTags = galleryTags;
        this.galleryTextPlace = galleryTextPlace;
        this.galleryImageLocation = galleryImageLocation;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getgalleryImageTitle() {
        return galleryImageTitle;
    }

    public void setgalleryImageTitle(String galleryImageTitle) {
        this.galleryImageTitle = galleryImageTitle;
    }

    public String getgallerySlug() {
        return gallerySlug;
    }

    public void setgallerySlug(String gallerySlug) {
        this.gallerySlug = gallerySlug;
    }

    public Date getgalleryDate() {
        return galleryDate;
    }

    public void setgalleryDate(Date galleryDate) {
        this.galleryDate = galleryDate;
    }

    public String getgalleryStatus() {
        return galleryStatus;
    }

    public void setgalleryStatus(String galleryStatus) {
        this.galleryStatus = galleryStatus;
    }

    public List<String> getgalleryTags() {
        return galleryTags;
    }

    public void setgalleryTags(List<String> galleryTags) {
        this.galleryTags = galleryTags;
    }

    public String getgalleryTextPlace() {
        return galleryTextPlace;
    }

    public void setgalleryTextPlace(String galleryTextPlace) {
        this.galleryTextPlace = galleryTextPlace;
    }

    public String getgalleryImageLocation() {
        return galleryImageLocation;
    }

    public void setgalleryImageLocation(String galleryImageLocation) {
        this.galleryImageLocation = galleryImageLocation;
    }

}

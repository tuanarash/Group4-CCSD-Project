package com.example.ccsd.Gallery;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//new change

@Service

public class GalleryService {
    
    @Autowired
    private GalleryRepository galleryRepository;

    // Getting all Gallery
    public List<Gallery> getAllGallery() {
        return galleryRepository.findAll();
    }

    // Getting single boks
    public Optional<Gallery> getGalleryById(String id) {
        return galleryRepository.findById(id);
    }

    // Creating new data in repository

    public Gallery addGallery(Gallery gallery) {
        return galleryRepository.save(gallery);
    }

    // Updating the Gallery

    public Gallery updateGallery(String id, Gallery galleryDetails) {
        Optional<Gallery> galleryOpt = galleryRepository.findById(id);
        if (galleryOpt.isPresent()) {

            // Get from database

            Gallery gallery = galleryOpt.get();
            gallery.setTitle(galleryDetails.getTitle());
            gallery.setPostSlug(galleryDetails.getPostSlug());
            gallery.setDate(galleryDetails.getDate());
            gallery.setStatus(galleryDetails.getStatus());
            gallery.setTag(galleryDetails.getTag());
            gallery.setPlace(galleryDetails.getPlace());
            gallery.setContent(galleryDetails.getContent());
            gallery.setImage(galleryDetails.getimage());       
            gallery.setPostShortDescription(galleryDetails.getPostShortDescription());
            return galleryRepository.save(gallery);
        }
        return null;
    }

    // Deleting
    
    public void deleteGallery(String id) {
        galleryRepository.deleteById(id);
    }

}


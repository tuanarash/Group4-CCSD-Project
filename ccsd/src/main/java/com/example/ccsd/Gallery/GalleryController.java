package com.example.ccsd.Gallery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/Gallery")
public class GalleryController {
    
    @Autowired
    private GalleryService galleryService;

    @GetMapping
    public List<Gallery> getAllGallery() {
        return galleryService.getAllGallery();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gallery> getGalleryById(@PathVariable String id) {
        return galleryService.getGalleryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Gallery addGallery(@RequestBody Gallery gallery) {
        return galleryService.addGallery(gallery);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gallery> updateGallery(@PathVariable String id, @RequestBody Gallery galleryDetails) {
        Gallery updatedGallery = galleryService.updateGallery(id, galleryDetails);
        if (updatedGallery != null) {
            return ResponseEntity.ok(updatedGallery);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE) //additional postmapping
    public ResponseEntity<Gallery> addGalleryJson(@RequestBody Gallery gallery) {
        Gallery savedGallery = galleryService.addGallery(gallery);
        return ResponseEntity.ok(savedGallery);
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) //additional postmapping
    public ResponseEntity<?> addGalleryMultipart(@ModelAttribute Gallery gallery) {
        Gallery savedGallery = galleryService.addGallery(gallery);
        return ResponseEntity.ok(savedGallery);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGallery(@PathVariable String id) {
        galleryService.deleteGallery(id);
        return ResponseEntity.noContent().build();
    }
}

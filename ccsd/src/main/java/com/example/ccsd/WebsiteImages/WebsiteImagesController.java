package com.example.ccsd.WebsiteImages;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/WebsiteImages")
public class WebsiteImagesController {
    
    @Autowired
    private WebsiteImagesService websiteImagesService;

    @GetMapping
    public List<WebsiteImages> getAllImages() {
        return websiteImagesService.getAllImages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WebsiteImages> getimageById(@PathVariable String id) {
        return websiteImagesService.getImageById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WebsiteImages addImage(@RequestBody WebsiteImages image) {
        return websiteImagesService.addImage(image);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WebsiteImages> updateImage(@PathVariable String id, @RequestBody WebsiteImages imageDetails) {
        WebsiteImages updatedImage = websiteImagesService.updateImage(id, imageDetails);
        if (updatedImage != null) {
            return ResponseEntity.ok(updatedImage);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable String id) {
        websiteImagesService.deleteImage(id);
        return ResponseEntity.noContent().build();
    }
}

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
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.bind.annotation.RequestParam;

//import java.io.IOException;

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

    /*@PostMapping
    public ResponseEntity<WebsiteImages> addImage(@RequestParam("image") MultipartFile image,
    @RequestParam("place") String place,
    @RequestParam("postShortDescription") String postShortDescription,
    @RequestParam("tag") String tag,
    @RequestParam("title") String title,
    @RequestParam("postSlug") String postSlug,
    @RequestParam("content") String content,
    @RequestParam("status") String status,
    @RequestParam("date") String date) throws IOException {
       // return websiteImagesService.addImage(image);
        // Convert the image into byte[] array
        byte[] imageBytes = image.getBytes();

        // Create WebsiteImages object
        WebsiteImages websiteImage = new WebsiteImages(place, postShortDescription, tag, title, postSlug, content, status, date, imageBytes);

        // Save to the database
        WebsiteImages savedImage = websiteImagesService.addImage(websiteImage);

        return ResponseEntity.ok(savedImage);
    }*/

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

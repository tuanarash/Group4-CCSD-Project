package com.example.ccsd.WebsiteImages;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/WebsiteImage")
public class WebsiteImagesController {
    
    @Autowired
    private WebsiteImagesService websiteImagesService;

    @GetMapping
    public List<WebsiteImages> getAllImages() {
        List<WebsiteImages> websiteImagesList = websiteImagesService.getAllImages();
        return websiteImagesList.stream()
        .map((websiteImages) -> {
            websiteImages.setImage64String(websiteImages.getImage64String());
            return websiteImages;
        })
        .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WebsiteImages> getimageById(@PathVariable String id) {
        return websiteImagesService.getImageById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    // @PostMapping
    // public WebsiteImages addImage(@RequestBody WebsiteImages image) {
    //     return websiteImagesService.addImage(image);
    // }

    @PostMapping
    public ResponseEntity<Map<String, Object>> addWebsiteImage(
    @RequestParam("title") String title,
    @RequestParam("postShortDescription") String postShortDescription,
    @RequestParam("date") String date,
    @RequestParam("status") String status,
    @RequestParam("tag") String tag,
    @RequestParam("place") String place,
    @RequestParam("content") String content,
    @RequestParam("postSlug") String postSlug,
    @RequestParam("image") MultipartFile image) throws IOException {

        // Convert the image into byte[] array
        byte[] imageBytes = image.getBytes();

        // Create WebsiteImages object
        WebsiteImages websiteImage = new WebsiteImages(place, postShortDescription, tag, title, postSlug, content, status, date, imageBytes);

        // Save to the MongoDB
        WebsiteImages savedImage = websiteImagesService.addImage(websiteImage);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("product", savedImage);

        return ResponseEntity.ok(response);
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

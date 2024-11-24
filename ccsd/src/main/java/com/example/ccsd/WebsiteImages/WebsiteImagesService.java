package com.example.ccsd.WebsiteImages;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class WebsiteImagesService {

    @Autowired
    private WebsiteImagesRepository websiteImagesRepository;

    // Getting all images
    
    public List<WebsiteImages> getAllImages() {
        return websiteImagesRepository.findAll();
    }

    // Getting single Image

    public Optional<WebsiteImages> getImageById(String id) {
        return websiteImagesRepository.findById(id);
    }

    // Creating new data in repository

    public WebsiteImages addImage(WebsiteImages image) {
        return websiteImagesRepository.save(image);
    }

    // Updating the image

    public WebsiteImages updateImage(String id, WebsiteImages imageDetails) {
        Optional<WebsiteImages> imageOpt = websiteImagesRepository.findById(id);
        if (imageOpt.isPresent()) {

            // Get from database

            WebsiteImages image = imageOpt.get();
            image.setTitle(imageDetails.getTitle());
            image.setPostShortDescription(imageDetails.getPostShortDescription());
            image.setDate(imageDetails.getDate());
            image.setStatus(imageDetails.getStatus());
            image.setTag(imageDetails.getTag());
            image.setPlace(imageDetails.getPlace());
            image.setContent(imageDetails.getContent());
            image.setPostSlug(imageDetails.getPostSlug());
            image.setImage(imageDetails.getImage());
            return websiteImagesRepository.save(image);
        }
        return null;
    }

    // Deleting
    
    public void deleteImage(String id) {
        websiteImagesRepository.deleteById(id);
    }
    // Save image in a local directory
    public String saveImageToStorage(String uploadDirectory, MultipartFile imageFile) throws IOException {
        String uniqueFileName = UUID.randomUUID().toString() + "_" + imageFile.getOriginalFilename();
    
        Path uploadPath = Path.of(uploadDirectory);
        Path filePath = uploadPath.resolve(uniqueFileName);
    
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
    
        Files.copy(imageFile.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
    
        return uniqueFileName;  // Return the filename, which you can later use for linking
    }
    
    // To view an image
    public byte[] getImage(String imageDirectory, String imageName) throws IOException {
        Path imagePath = Path.of(imageDirectory, imageName);

        if (Files.exists(imagePath)) {
            byte[] imageBytes = Files.readAllBytes(imagePath);
            return imageBytes;
        } else {
            return null; // Handle missing images
        }
    }


    
}

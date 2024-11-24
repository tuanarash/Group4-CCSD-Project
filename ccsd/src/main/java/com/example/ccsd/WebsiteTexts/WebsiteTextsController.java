package com.example.ccsd.WebsiteTexts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping; //baru tambah
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000") // Allow requests from your frontend
@RestController
@RequestMapping("api/WebsiteTexts")
public class WebsiteTextsController {
    
    @Autowired
    private WebsiteTextsService websiteTextsService;

    @GetMapping
    public List<WebsiteTexts> getAllWebsiteTexts() {
        return websiteTextsService.getAllWebsiteTexts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WebsiteTexts> getWebsiteTextsById(@PathVariable String id) {
        return websiteTextsService.getWebsiteTextsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WebsiteTexts addBook(@RequestBody WebsiteTexts websiteTexts) {
        return websiteTextsService.addWebsiteTexts(websiteTexts);
    }

     @PutMapping("/{id}")
    public ResponseEntity<WebsiteTexts> updateWebsiteTexts(@PathVariable String id, @RequestBody WebsiteTexts websiteTextsDetails) {
        WebsiteTexts updatedWebsiteTexts = websiteTextsService.updateWebsiteTexts(id, websiteTextsDetails);
        if (updatedWebsiteTexts != null) {
            return ResponseEntity.ok(updatedWebsiteTexts);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWebsiteTexts(@PathVariable String id) {
        websiteTextsService.deleteWebsiteTexts(id);
        return ResponseEntity.noContent().build();
    }
}

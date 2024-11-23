package com.example.ccsd.WebsiteTexts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebsiteTextsService {
    

    @Autowired
    private WebsiteTextsRepository websiteTextsRepository;

    // Getting all books
    public List<WebsiteTexts> getAllWebsiteTexts() {
        return websiteTextsRepository.findAll();
    }

    // Getting single boks
    public Optional<WebsiteTexts> getWebsiteTextsById(String id) {
        return websiteTextsRepository.findById(id);
    }

    // Creating new data in repository

    public WebsiteTexts addWebsiteTexts(WebsiteTexts websiteTexts) {
        return websiteTextsRepository.save(websiteTexts);
    }

    // Updating the book

    public WebsiteTexts updateWebsiteTexts(String id, WebsiteTexts websiteTextsDetails) {
        Optional<WebsiteTexts> WebsiteTextsOpt = websiteTextsRepository.findById(id);
        if (WebsiteTextsOpt.isPresent()) {

            // Get from database

            WebsiteTexts websiteTexts = WebsiteTextsOpt.get();
            websiteTexts.setTitle(websiteTextsDetails.getTitle());
            websiteTexts.setContent(websiteTextsDetails.getContent());
            websiteTexts.setPostShortDescription(websiteTextsDetails.getPostShortDescription());
            websiteTexts.setTag(websiteTextsDetails.getTag());
            websiteTexts.setStatus(websiteTextsDetails.getStatus());
            websiteTexts.setPlace(websiteTextsDetails.getPlace());
            websiteTexts.setDate(websiteTextsDetails.getDate());
            websiteTexts.setPostSlug(websiteTextsDetails.getPostSlug());
            websiteTexts.setImage(websiteTextsDetails.getImage());

            return websiteTextsRepository.save(websiteTexts);
        }
        return null;
    }

    // Deleting
    
    public void deleteWebsiteTexts(String id) {
        websiteTextsRepository.deleteById(id);
    }
}

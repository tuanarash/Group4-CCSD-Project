package com.example.ccsd.Products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    // Getting all Productss
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    // Getting single boks
    public Optional<Products> getProductsById(String id) {
        return productsRepository.findById(id);
    }

    // Creating new data in repository

    public Products addProducts(Products products) {
        return productsRepository.save(products);
    }

    // Updating the Products

    public Products updateProducts(String id, Products productsDetails) {
        Optional<Products> productsOpt = productsRepository.findById(id);
        if (productsOpt.isPresent()) {

            // Get from database

            Products products = productsOpt.get();
            products.setTitle(productsDetails.getTitle());
            products.setPostSlug(productsDetails.getPostSlug());
            products.setDate(productsDetails.getDate());
            products.setStatus(productsDetails.getStatus());
            products.setTag(productsDetails.getTag());
            products.setPlace(productsDetails.getPlace());
            products.setContent(productsDetails.getContent());
            products.setImage(productsDetails.getimage());
            products.setPostShortDescription(productsDetails.getPostShortDescription());
            return productsRepository.save(products);
        }
        return null;
    }

    // Deleting
    
    public void deleteProducts(String id) {
        productsRepository.deleteById(id);
    }
}

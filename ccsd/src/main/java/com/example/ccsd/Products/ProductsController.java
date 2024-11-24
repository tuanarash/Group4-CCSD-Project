package com.example.ccsd.Products;

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
@RequestMapping("/api/Products")
public class ProductsController {
    
    @Autowired
    private ProductsService productsService;

    @GetMapping
    public List<Products> getAllProducts(){
        return productsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Products> getProductsById(@PathVariable String id) {
        return productsService.getProductsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Products addProducts(@RequestBody Products products) {
        return productsService.addProducts(products);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)  //additional postmapping
    public ResponseEntity<Products> addProductsJson(@RequestBody Products products) {
        Products savedProducts = productsService.addProducts(products);
        return ResponseEntity.ok(savedProducts);
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)  //additional postmapping
    public ResponseEntity<?> addProductsMultipart(@ModelAttribute Products products) {
        Products savedProducts = productsService.addProducts(products);
        return ResponseEntity.ok(savedProducts);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Products> updateProducts(@PathVariable String id, @RequestBody Products productsDetails) {
        Products updatedProducts = productsService.updateProducts(id, productsDetails);
        if (updatedProducts != null) {
            return ResponseEntity.ok(updatedProducts);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducts(@PathVariable String id) {
        productsService.deleteProducts(id);
        return ResponseEntity.noContent().build();
    }
}

package com.eulbyvan.controller;

import com.eulbyvan.model.Product;
import com.eulbyvan.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = productService.getProducts();

        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") Long id) {
        Optional<Product> products = productService.getProductById(id);

        return ResponseEntity.ok().body(products);
    }
}

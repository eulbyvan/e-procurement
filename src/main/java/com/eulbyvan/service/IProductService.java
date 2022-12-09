package com.eulbyvan.service;

import com.eulbyvan.model.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

public interface IProductService {
    List<Product> getProducts();
    Optional<Product> getProductById(Long id);

    Product addProduct(Product product);
}

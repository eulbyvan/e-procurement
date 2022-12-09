package com.eulbyvan.service.implementation;

import com.eulbyvan.model.Product;
import com.eulbyvan.repo.IProductRepo;
import com.eulbyvan.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@RequiredArgsConstructor
@Service
@Transactional
public class ProductService implements IProductService {
    private IProductRepo productRepo;

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepo.findById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
}

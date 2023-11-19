package com.in60minutes.demo.service;

import com.in60minutes.demo.entity.Product;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    Product getProductById(Long id);

    Product updateProduct(Product product);

    String deleteProduct(Long id);

    List<Product> getAllProducts();
}

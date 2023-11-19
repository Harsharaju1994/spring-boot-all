package com.in60minutes.demo.service;

import com.in60minutes.demo.entity.Product;
import com.in60minutes.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;


    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productDetails = productRepo.findById(
                product.getProductId()
        );
        productDetails.setProductName(product.getProductName());
       productDetails.setPrice(product.getPrice());
       productDetails.setDept(product.getDept());
        return productRepo.save(productDetails);
    }

    @Override
    public String deleteProduct(Long id) {
        productRepo.deleteById(id);
        return "Product deleted successfully..";
    }

    @Override
    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }
}

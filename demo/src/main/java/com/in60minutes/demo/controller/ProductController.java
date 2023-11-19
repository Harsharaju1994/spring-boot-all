package com.in60minutes.demo.controller;

import com.in60minutes.demo.entity.Product;
import com.in60minutes.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("saveProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product),Htt);
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<Product> fetchProduct(@PathVariable Long id){
        return new ResponseEntity<Product>(productService.getProductById(id),);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<Product>> fetchAllProducts(){
        return new ResponseEntity<List<Product>>(productService.getAllProducts(),);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.updateProduct(product),);
    }

    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        return new ResponseEntity<>(productService.deleteProduct(id),H)
    }
}

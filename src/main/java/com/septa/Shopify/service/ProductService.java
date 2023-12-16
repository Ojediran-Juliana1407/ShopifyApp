package com.septa.Shopify.service;

import com.septa.Shopify.dto.ProductDTO;
import com.septa.Shopify.model.Product;
import com.septa.Shopify.repository.ProductRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Object CreateProduct (ProductDTO productDTO){
        Product product = new Product();

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setStockQuantity(productDTO.getStockQuantity());

        return productRepository.save(product);
    }

    public Object GetAllProduct() {return productRepository.findAll();}

    public Object GetProductById(Long id) {return productRepository.findById(id);}

}





















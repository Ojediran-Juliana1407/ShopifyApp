package com.septa.Shopify.repository;

import com.septa.Shopify.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.apache.tomcat.jni.Library;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

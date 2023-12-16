package com.septa.Shopify.repository;

import com.septa.Shopify.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

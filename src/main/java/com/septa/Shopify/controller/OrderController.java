package com.septa.Shopify.controller;

import com.septa.Shopify.dto.OrderDTO;
import com.septa.Shopify.dto.ProductDTO;
import com.septa.Shopify.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/order")

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public Object createOrder (OrderDTO orderDTO){
        return orderService.CreateOrder(orderDTO);
    }

    @GetMapping("/get")
    public Object getAllOrder() {return orderService.GetAllOrder();}

    @GetMapping("/get/{id}")
    public Object getOrderById(@PathVariable Long id)
    {return orderService.GetOrderById(id);}


























}

package com.example.orderservice.service;

import com.example.orderservice.dto.Product;
import com.example.orderservice.model.Order;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    private final String PRODUCT_SERVICE_URL = "http://localhost:8081/api/products";
    
    public Order createOrder(Long productId, Integer quantity) {
        // Call ProductService to get product details
        if (productId == null || quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Invalid product ID or quantity");
        }
        System.out.println("Fetching product with ID: " + productId);
        Product product = restTemplate.getForObject(
            PRODUCT_SERVICE_URL + "/" + productId, 
            Product.class
        );
        
        if (product == null) {
            throw new RuntimeException("Product not found with id: " + productId);
        }
        
        // Calculate total price
        Double totalPrice = product.getPrice() * quantity;
        
        // Create order
        Order order = new Order(productId, product.getName(), quantity, totalPrice);
        
        return orderRepository.save(order);
    }
}
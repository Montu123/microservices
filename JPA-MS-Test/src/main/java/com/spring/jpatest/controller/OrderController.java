package com.spring.jpatest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpatest.dto.OrderRequest;
import com.spring.jpatest.dto.OrderResponse;
import com.spring.jpatest.entity.Customer;
import com.spring.jpatest.repository.CustomerRepository;
import com.spring.jpatest.repository.ProductRepository;

@RestController
public class OrderController {
@Autowired
CustomerRepository customerRepository;
@Autowired
ProductRepository productRepository;
@PostMapping("/placeOder")
public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
	return customerRepository.save(orderRequest.getCustomer());
}
@GetMapping("/findAllOders")
public List<Customer> findAllOrder(){
	return customerRepository.findAll();
}
@GetMapping("/getOrderResponse")
public List<OrderResponse> getCustomerDetails(){
	return customerRepository.getCustomerDetails();
}
}

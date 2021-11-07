package com.spring.jpatest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.jpatest.dto.OrderResponse;
import com.spring.jpatest.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query("SELECT new com.spring.jpatest.dto.OrderResponse(c.name, p.productName) FROM Customer c join c.products p")
	public List<OrderResponse> getCustomerDetails();

}

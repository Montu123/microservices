package com.spring.jpatest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.jpatest.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

public interface ProductReposity extends JpaRepository<Product, Long> {

	List<Product> findAllByOrderByNameAsc();
}

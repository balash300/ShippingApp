package com.example.task2.repository;

import com.example.task2.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    List<Products> getProductsById(Long id);

}

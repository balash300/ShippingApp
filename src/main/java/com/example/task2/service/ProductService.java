package com.example.task2.service;

import com.example.task2.dto.ProductDto;
import com.example.task2.dto.request.ProductRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ProductDto getProductsById(Long id);

    void saveProducts(ProductRequest productsRequest);

    void updateProducts(ProductRequest productsRequest);

    void deleteById(Long id);

    List<ProductDto> getAll();
}

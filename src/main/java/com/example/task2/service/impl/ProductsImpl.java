package com.example.task2.service.impl;

import com.example.task2.dto.ProductDto;
import com.example.task2.dto.request.ProductRequest;
import com.example.task2.model.Products;
import com.example.task2.repository.ProductsRepository;
import com.example.task2.service.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ProductsImpl implements ProductService {

    private final ProductsRepository productsRepository;

    @Override
    public ProductDto getProductsById(Long id) {
        Products products = (Products) productsRepository.getProductsById(id);
        return ProductDto.builder()
                .productName(products.getProductName())
                .quantityPerUnit(products.getQuantityPerUnit())
                .unitPrice(products.getUnitPrice())
                .unitsInStock(products.getUnitsInStock())
                .build();
    }

    @Override
    public void saveProducts(ProductRequest productsRequest) {
            Products products = Products.builder()
                    .productName(productsRequest.getProductName())
                    .quantityPerUnit(productsRequest.getQuantityPerUnit())
                    .unitPrice(productsRequest.getUnitPrice())
                    .discontinued(productsRequest.getDiscontinued())
                    .build();

            productsRepository.save(products);
    }

    @Override
    public void updateProducts(ProductRequest productsRequest) {
        Products products = Products.builder()
                .id(productsRequest.getId())
                .productName(productsRequest.getProductName())
                .quantityPerUnit(productsRequest.getQuantityPerUnit())
                .unitPrice(productsRequest.getUnitPrice())
                .unitsInStock(productsRequest.getUnitsInStock())
                .build();

        productsRepository.save(products);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            productsRepository.deleteById(id);
        }
    }

    @Override
    public List<ProductDto> getAll() {
        List<Products> products1 = productsRepository.findAll();
        List<ProductDto> productsDtos = new ArrayList<>();

        for (Products products : products1){
            ProductDto productsDto = ProductDto.builder()
                    .productName(products.getProductName())
                    .quantityPerUnit(products.getQuantityPerUnit())
                    .unitPrice(products.getUnitPrice())
                    .unitsInStock(products.getUnitsInStock())
                    .build();

            productsDtos.add(productsDto);
        }
        return productsDtos;
    }
}

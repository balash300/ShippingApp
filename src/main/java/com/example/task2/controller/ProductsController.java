package com.example.task2.controller;

import com.example.task2.dto.ProductDto;
import com.example.task2.dto.request.ProductRequest;
import com.example.task2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductsController {

    final ProductService productService;

    @GetMapping(value = "/productsList")
    public List<ProductDto> getProductInfo(){return productService.getAll();}

    @GetMapping(value = "/getProductsById/{id}")
    public ProductDto getProductsById(@PathVariable(value = "id")Long id){
        return getProductsById(id);
    }

    @PostMapping(value = "/saveProducts")
    public void saveProducts(@RequestBody ProductRequest productsRequest){
        productService.saveProducts(productsRequest);
    }

    @PostMapping(value = "/updateProducts")
    public void updateProducts (@RequestBody ProductRequest productsRequest){
        productService.updateProducts(productsRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        productService.deleteById(id);
    }
}

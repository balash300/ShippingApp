package com.example.task2.service;

import com.example.task2.dto.CategoriesDto;
import com.example.task2.dto.request.CategoriesRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriesService {

    CategoriesDto getCategoriesById(Long id);

    void saveCategories(CategoriesRequest categoriesRequest);

    void updateCategories(CategoriesRequest categoriesRequest);

    void deleteById(Long id);

    List<CategoriesDto> getAll();

}

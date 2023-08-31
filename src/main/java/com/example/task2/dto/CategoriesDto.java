package com.example.task2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriesDto {
    private String categoryName;
    private String desc;
    private ImageIcon picture;
}

package com.example.task2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriesRequest {
    private Long categoryID;
    private String categoryName;
    private String desc;
    private ImageIcon picture;
}

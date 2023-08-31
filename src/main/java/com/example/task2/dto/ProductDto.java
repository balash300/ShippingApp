package com.example.task2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String productName;
    private String quantityPerUnit;
    private String unitPrice;
    private String unitsInStock;
    private String unitsOnOrder;
    private String reorderLevel;
}

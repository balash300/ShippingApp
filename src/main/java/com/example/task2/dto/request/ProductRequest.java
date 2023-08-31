package com.example.task2.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private Long id;
    private String productName;
    private String quantityPerUnit;
    private String unitPrice;
    private String unitsInStock;
    private String unitsOnOrder;
    private String reorderLevel;
    private String discontinued;
}

package com.example.task2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailRequest {
    private Long orderID;
    private Long productID;
    private String unitPrice;
    private Long quantity;
    private String discount;
}

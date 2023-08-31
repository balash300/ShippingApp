package com.example.task2.service;

import com.example.task2.dto.OrderDetailsDto;
import com.example.task2.dto.request.OrderDetailRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDetailsService {

    OrderDetailsDto getOrderDetailsById(Long id);

    void saveOrderDetails(OrderDetailRequest orderDetailsRequest);

    void updateOrderDetails(OrderDetailRequest orderDetailsRequest);

    void deleteById(Long id);

    List<OrderDetailsDto> getAll();

}

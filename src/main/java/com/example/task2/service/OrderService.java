package com.example.task2.service;

import com.example.task2.dto.OrdersDto;
import com.example.task2.dto.request.OrderRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    OrdersDto getOrdersById(Long id);

    void saveOrders(OrderRequest ordersRequest);

    void updateOrders(OrderRequest ordersRequest);

    void deleteById(Long id);

    List<OrdersDto> getAll();
}

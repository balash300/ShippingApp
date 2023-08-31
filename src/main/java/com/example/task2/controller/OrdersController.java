package com.example.task2.controller;

import com.example.task2.dto.OrdersDto;
import com.example.task2.dto.request.OrderRequest;
import com.example.task2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orders")
public class OrdersController {

    final OrderService orderService;

    @GetMapping(value = "/ordersList")
    public List<OrdersDto> getOrdersInfo(){return orderService.getAll();}

    @GetMapping(value = "/getOrdersById/{id}")
    public OrdersDto getOrdersById(@PathVariable(value = "id") Long id){
        return getOrdersById(id);
    }

    @PostMapping(value = "/saveOrders")
    public void saveOrders(@RequestBody OrderRequest ordersRequest){
        orderService.saveOrders(ordersRequest);
    }

    @PostMapping(value = "/updateOrders")
    public void updateOrders(@RequestBody OrderRequest ordersRequest){
        orderService.updateOrders(ordersRequest);
    }


    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        orderService.deleteById(id);
    }
}

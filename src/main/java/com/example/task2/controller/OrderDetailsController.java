package com.example.task2.controller;

import com.example.task2.dto.OrderDetailsDto;
import com.example.task2.dto.request.OrderDetailRequest;
import com.example.task2.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orderDetails")
public class OrderDetailsController {

    final OrderDetailsService orderDetailsService;

    @GetMapping(value = "/orderList")
    public List<OrderDetailsDto> getOrderDetailsInfo(){
        return orderDetailsService.getAll();
    }

    @GetMapping(value = "/getOrderDetailsById/{id}")
    public OrderDetailsDto getOrderDetailsById(@PathVariable(value = "id") Long id){
        return getOrderDetailsById(id);
    }

    @PostMapping(value = "/saveOrderDetails")
    public void saveOrderDetails(@RequestBody OrderDetailRequest orderDetailsRequest){
        orderDetailsService.saveOrderDetails(orderDetailsRequest);
    }

    @PostMapping(value = "/updateOrderDetails")
    public void updateOrderDetails(@RequestBody OrderDetailRequest orderDetailsRequest){
        orderDetailsService.updateOrderDetails(orderDetailsRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        orderDetailsService.deleteById(id);
    }

}

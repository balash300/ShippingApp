package com.example.task2.service;

import com.example.task2.dto.ShipperDto;
import com.example.task2.dto.request.ShipperRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShippersService {

    ShipperDto getShippersById(Long id);

    void saveShipper(ShipperRequest shipperRequest);

    void updateShipper(ShipperRequest shipperRequest);

    void deleteById(Long id);

    List<ShipperDto> getAll();

}

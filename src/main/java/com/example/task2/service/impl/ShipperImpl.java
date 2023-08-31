package com.example.task2.service.impl;

import com.example.task2.dto.ShipperDto;
import com.example.task2.dto.request.ShipperRequest;
import com.example.task2.model.Shippers;
import com.example.task2.repository.ShippersRepository;
import com.example.task2.service.ShippersService;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ShipperImpl implements ShippersService {

    private final ShippersRepository shipperRepository;
    @Override
    public ShipperDto getShippersById(Long id) {
        Shippers shipper = shipperRepository.getShippersByShipperID(id);
        return ShipperDto.builder()
                .companyName(shipper.getCompanyName())
                .phone(shipper.getPhone())
                .build();
    }

    @Override
    public void saveShipper(ShipperRequest shipperRequest) {
        Shippers shipper = Shippers.builder()
                .companyName(shipperRequest.getCompanyName())
                .build();

        shipperRepository.save(shipper);
    }

    @Override
    public void updateShipper(ShipperRequest shipperRequest) {
        Shippers shipper = Shippers.builder()
                .companyName(shipperRequest.getCompanyName())
                .phone(shipperRequest.getPhone())
                .build();

        shipperRepository.save(shipper);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            shipperRepository.deleteById(id);
        }
    }

    @Override
    public List<ShipperDto> getAll() {
        List<Shippers> shippers = shipperRepository.findAll();
        List<ShipperDto> shipperDtos = new ArrayList<>();

        for (Shippers shipper : shippers){
            ShipperDto shipperDto = ShipperDto.builder()
                    .companyName(shipper.getCompanyName())
                    .phone(shipper.getPhone())
                    .build();

            shipperDtos.add(shipperDto);
        }
        return shipperDtos;
    }
}

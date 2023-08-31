package com.example.task2.service.impl;

import com.example.task2.dto.SupplierDto;
import com.example.task2.dto.request.SupplierRequest;
import com.example.task2.model.Suppliers;
import com.example.task2.repository.SuppliersRepository;
import com.example.task2.service.SupplierService;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class SuppliersImpl implements SupplierService {

    private final SuppliersRepository suppliersRepository;

    @Override
    public SupplierDto getSuppliersById(Long id) {

        Suppliers suppliers = suppliersRepository.getSuppliersBySupplierID(id);
        return SupplierDto.builder()
                .companyName(suppliers.getCompanyName())
                .contactName(suppliers.getContactName())
                .address(suppliers.getAddress())
                .city(suppliers.getCity())
                .region(suppliers.getRegion())
                .country(suppliers.getCountry())
                .phone(suppliers.getPhone())
                .build();
    }

    @Override
    public void saveSuppliers(SupplierRequest suppliersRequest) {

        Suppliers suppliers = Suppliers.builder()
                .companyName(suppliersRequest.getCompanyName())
                .address(suppliersRequest.getAddress())
                .country(suppliersRequest.getCountry())
                .phone(suppliersRequest.getPhone())
                .build();

        suppliersRepository.save(suppliers);

    }

    @Override
    public void updateSuppliers(SupplierRequest suppliersRequest) {

        Suppliers suppliers = Suppliers.builder()
                .companyName(suppliersRequest.getCompanyName())
                .contactName(suppliersRequest.getContactName())
                .address(suppliersRequest.getAddress())
                .city(suppliersRequest.getCity())
                .country(suppliersRequest.getCountry())
                .phone(suppliersRequest.getPhone())
                .build();

        suppliersRepository.save(suppliers);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            suppliersRepository.deleteById(id);
        }
    }

    @Override
    public List<SupplierDto> getAll() {
        List<Suppliers> suppliers1 = suppliersRepository.findAll();
        List<SupplierDto> suppliersDtos = new ArrayList<>();

        for (Suppliers suppliers : suppliers1){
            SupplierDto suppliersDto = SupplierDto.builder()
                    .companyName(suppliers.getCompanyName())
                    .contactName(suppliers.getContactName())
                    .address(suppliers.getAddress())
                    .city(suppliers.getCity())
                    .region(suppliers.getRegion())
                    .country(suppliers.getCountry())
                    .phone(suppliers.getPhone())
                    .build();

            suppliersDtos.add(suppliersDto);
        }
        return suppliersDtos;
    }
}

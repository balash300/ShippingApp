package com.example.task2.service;

import com.example.task2.dto.SupplierDto;
import com.example.task2.dto.request.SupplierRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    SupplierDto getSuppliersById(Long id);

    void saveSuppliers(SupplierRequest suppliersRequest);

    void updateSuppliers(SupplierRequest suppliersRequest);

    void deleteById(Long id);

    List<SupplierDto> getAll();

}

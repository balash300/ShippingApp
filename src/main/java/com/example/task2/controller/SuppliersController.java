package com.example.task2.controller;

import com.example.task2.dto.SupplierDto;
import com.example.task2.dto.request.SupplierRequest;
import com.example.task2.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/suppliers")
public class SuppliersController {

    final SupplierService supplierService;

    @GetMapping(value = "/suppliersList")
    public List<SupplierDto> getSuppliersInfo(){return supplierService.getAll();}

    @GetMapping(value = "/getSuppliersById/{id}")
    public SupplierDto getSuppliersById(@PathVariable(value = "id")Long id){return getSuppliersById(id);}

    @PostMapping(value = "/saveSuppliers")
    public void saveSuppliers(@RequestBody SupplierRequest suppliersRequest){
        supplierService.saveSuppliers(suppliersRequest);
    }

    @PostMapping(value = "/updateSuppliers")
    public void updateSuppliers(@RequestBody SupplierRequest suppliersRequest){
        supplierService.updateSuppliers(suppliersRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        supplierService.deleteById(id);
    }

}


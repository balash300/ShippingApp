package com.example.task2.repository;

import com.example.task2.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<Orders> getOrdersById(Long id);
}

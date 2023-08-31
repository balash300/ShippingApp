package com.example.task2.repository;

import com.example.task2.model.Shippers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippersRepository extends JpaRepository<Shippers, Long> {

    Shippers getShippersByShipperID(Long id);

}

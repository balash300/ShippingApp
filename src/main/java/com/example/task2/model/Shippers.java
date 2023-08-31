package com.example.task2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shippers")
public class Shippers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipper_id", nullable = false)
    private Long shipperID;
    @Column(name = "company_name")
    @NotBlank
    private String companyName;
    @Column(name = "phone")
    @NotBlank
    private String phone;

    @OneToMany(mappedBy = "shippers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orders> orderses = new ArrayList<>();

}

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
@Table(name = "suppliers")
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", nullable = false)
    private Long supplierID;
    @Column(name = "company_name")
    @NotBlank
    private String companyName;
    @Column(name = "contact_name")
    @NotBlank
    private String contactName;
    @Column(name = "contact_title")
    @NotBlank
    private String contactTitle;
    @NotBlank
    private String address;
    @NotBlank
    private String city;
    private String region;
    @Column(name = "postal_code")
    private String postalCode;
    private String country;
    private String phone;
    private String fax;
    @Column(name = "home_page")
    private String homePage;

    @OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Products> productses = new ArrayList<>();

}

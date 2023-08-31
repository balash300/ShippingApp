package com.example.task2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "customer_id")
    @NotBlank
    private Long customarID;
    @Column(name = "employee_id")
    @NotBlank
    private Long employeeID;
    @Column(name = "order_date")
    @NotBlank
    private Date orderDate;
    @Column(name = "required_date")
    @NotBlank
    private Date requiredDate;
    @Column(name = "shipped_date")
    @NotBlank
    private Date shippedDate;
    @Column(name = "ship_via")
    @NotBlank
    private String shipVia;
    @Column(name = "freight")
    @NotBlank
    private String freight;
    @Column(name = "ship_name")
    @NotBlank
    private String shipName;
    @Column(name = "ship_address")
    @NotBlank
    private String shipAddress;
    @Column(name = "ship_city")
    @NotBlank
    private String shipCity;
    @Column(name = "ship_region")
    @NotBlank
    private String shipRegion;
    @Column(name = "ship_postal_code")
    @NotBlank
    private String shipPostalCode;
    @Column(name = "ship_country")
    @NotBlank
    private String shipCountry;

    @ManyToMany(mappedBy = "orders", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @OrderBy("orders")
    private List<Products> productses = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipper_id")
    private Shippers shippers;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetails> orderDetailses = new ArrayList<>();



}

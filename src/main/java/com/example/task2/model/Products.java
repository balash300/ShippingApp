package com.example.task2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "product_name")
    @NotBlank
    private String productName;
    @Column(name = "quantity_per_unit")
    @NotBlank
    private String quantityPerUnit;
    @Column(name = "unit_price")
    @NotBlank
    private String unitPrice;
    @Column(name = "units_in_stock")
    @NotBlank
    private String unitsInStock;
    @Column(name = "units_on_order")
    @NotBlank
    private String unitsOnOrder;
    @Column(name = "reorder_level")
    @NotBlank
    private String reorderLevel;
    @Column(name = "discontinued")
    @NotBlank
    private String discontinued;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Categories categories;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_id")
    private Suppliers suppliers;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "order_details",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Orders> orders = new ArrayList<>();

    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetails> orderDetailses = new ArrayList<>();

}

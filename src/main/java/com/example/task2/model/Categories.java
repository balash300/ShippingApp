package com.example.task2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    private Long categoryID;
    @Column(name = "category_name")
    @NotBlank
    private String categoryName;
    @Column(name = "description")
    @NotBlank
    private String desc;
    @NotBlank
    private ImageIcon picture;

    @OneToMany(mappedBy = "categories", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Products> productses = new ArrayList<>();

}

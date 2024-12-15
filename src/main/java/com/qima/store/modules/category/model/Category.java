package com.qima.store.modules.category.model;

import com.qima.store.modules.product.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(generator = "SEQ_CATEGORY", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_CATEGORY", allocationSize = 1, sequenceName = "SEQ_CATEGORY")
    private Long id;

    @Column(nullable = false)
    private String path;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Product> products;
}

package com.qima.store.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Table(name = "PRODUCT")
@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "SEQ_PRODUCT", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_PRODUCT", allocationSize = 1, sequenceName = "SEQ_PRODUCT")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(nullable = false, name = "FK_CATEGORY")
    private Category category;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;
}

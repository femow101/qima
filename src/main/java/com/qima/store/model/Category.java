package com.qima.store.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

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
}

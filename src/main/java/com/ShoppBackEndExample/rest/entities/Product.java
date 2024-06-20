package com.ShoppBackEndExample.rest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

}

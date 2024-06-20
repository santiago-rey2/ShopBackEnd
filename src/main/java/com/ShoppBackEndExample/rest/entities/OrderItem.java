package com.ShoppBackEndExample.rest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    private Order order;

    private BigDecimal productPrice;
    private int quantity;
}

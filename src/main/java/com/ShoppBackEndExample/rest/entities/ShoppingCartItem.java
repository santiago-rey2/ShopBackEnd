package com.ShoppBackEndExample.rest.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class ShoppingCartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "shoppingCartId")
    private ShoppingCart shoppingCart;

    private int quantity;

}

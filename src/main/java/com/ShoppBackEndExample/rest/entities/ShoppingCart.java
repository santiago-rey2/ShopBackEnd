package com.ShoppBackEndExample.rest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "shoppingCart")
    private Set<ShoppingCartItem> items = new HashSet<>();

    @OneToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
}

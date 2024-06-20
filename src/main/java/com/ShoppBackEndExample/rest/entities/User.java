package com.ShoppBackEndExample.rest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    public enum RoleType {USER};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private RoleType role;

    @OneToOne(mappedBy = "user",optional = false,fetch = FetchType.LAZY)
    private ShoppingCart shoppingCart;


}

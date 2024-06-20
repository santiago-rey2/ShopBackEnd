package com.ShoppBackEndExample.rest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private String postalCode;
    private String postalAddress;
    @OneToMany(mappedBy = "order")
    private Set<OrderItem> items = new HashSet<>();

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;


}

package com.sena.crud_basic.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity(name = "viewedproduct")
public class viewedproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "viewed_date", nullable = false)
    private LocalDateTime viewedDate;
}

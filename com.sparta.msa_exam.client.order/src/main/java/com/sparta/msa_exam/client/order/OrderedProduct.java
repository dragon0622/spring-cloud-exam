package com.sparta.msa_exam.client.order;

import jakarta.persistence.*;

public class OrderedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @Column(name = "product_id")
    private Long productId;

    public OrderedProduct(Order order, Long alreadyInsert) {
        this.order = order;
        this.productId = alreadyInsert;
    }
}

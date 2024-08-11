package com.sparta.msa_exam.client.product.domain;

import com.sparta.msa_exam.client.product.dto.ProductRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name")
    private String name;

    @Column(name = "supply_price")
    private Integer supplyPrice;

    public Product(ProductRequestDTO productRequestDTO) {
    this.name = productRequestDTO.getName();
    this.supplyPrice = productRequestDTO.getSupply_price();
    }
}

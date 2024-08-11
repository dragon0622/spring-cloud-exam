package com.sparta.msa_exam.client.product.dto;

import com.sparta.msa_exam.client.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductRequestDTO {
    private String name;
    private Integer supply_price;
}

package com.sparta.msa_exam.client.product.dto;


import com.sparta.msa_exam.client.product.domain.Product;
import lombok.*;

@Getter
@Setter
public class ProductResponseDTO {
    private Long product_id;
    private String name;
    private Integer supply_price;

    public ProductResponseDTO(Product product){
        this.product_id = product.getProductId();
        this.name = product.getName();
        this.supply_price = product.getSupplyPrice();
    }
}

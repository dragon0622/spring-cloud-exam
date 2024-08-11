package com.sparta.msa_exam.client.order;

import lombok.Getter;

import java.util.List;


@Getter
public class OrderResponseDTO {
    private final Long orderId;
    private final List<Integer> productIds;

    public OrderResponseDTO(Long orderId, List<Integer> productIdList) {

        this.orderId = orderId;
        this.productIds = productIdList;
    }
}

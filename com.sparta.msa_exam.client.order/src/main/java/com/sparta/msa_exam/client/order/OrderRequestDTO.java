package com.sparta.msa_exam.client.order;

import lombok.Getter;

import java.util.List;

@Getter
public class OrderRequestDTO {
    private String orderName;
    private List<Long> productIds;
}

package com.sparta.msa_exam.client.order;

import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderedProductRepository extends JpaRepository<OrderedProduct, Long> {
    List<Integer> findAllProductIdByOrderId(@Param("orderId") Long orderId);
}

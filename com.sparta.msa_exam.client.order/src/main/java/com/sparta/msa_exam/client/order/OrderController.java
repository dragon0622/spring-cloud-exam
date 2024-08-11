package com.sparta.msa_exam.client.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public void addOrder(@RequestBody OrderRequestDTO orderRequestDTO){
        orderService.save(orderRequestDTO);
    }

    @PutMapping("/{orderId}")
    public void putOrder(@PathVariable Long orderId, OrderRequestDTO orderRequestDTO){
        orderService.putOrder(orderId, orderRequestDTO);
    }

    @GetMapping("/{orderId}")
    public OrderResponseDTO getOrder(@PathVariable Long productId){
        OrderResponseDTO orderResponseDTO = orderService.getOrder(productId);
        return orderResponseDTO;
    }



}

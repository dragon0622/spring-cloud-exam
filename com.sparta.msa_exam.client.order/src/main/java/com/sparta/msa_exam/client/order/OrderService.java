package com.sparta.msa_exam.client.order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderedProductRepository orderedProductRepository;

    private final OrderRepository orderRepository;

    private final ProductClient productClient;

    public Long getProductClient(String productId) {
        return productClient.getProduct(productId);
    }

    public OrderService(OrderedProductRepository orderedProductRepository, OrderRepository orderRepository, ProductClient productClient) {
        this.orderedProductRepository = orderedProductRepository;
        this.orderRepository = orderRepository;
        this.productClient = productClient;
    }



    public void save(OrderRequestDTO orderRequestDTO) {
    }

    public void putOrder(Long orderId, OrderRequestDTO orderRequestDTO) {
        Order order = orderRepository.findById(orderId).orElseThrow(()->
                new IllegalArgumentException("Enabled ID"));
        String product = orderRequestDTO.getOrderName();

        Long alreadyInsert = getProductClient(product);

        if (alreadyInsert.equals(null)){
            OrderedProduct orderedProduct = new OrderedProduct(order, alreadyInsert);
            orderedProductRepository.save(orderedProduct);
        }
        else{
            throw new IllegalArgumentException("Enabled Product");
        }
    }


    public OrderResponseDTO getOrder(Long orderId) {
        orderRepository.findById(orderId);

        List<Integer> productIdList = orderedProductRepository.findAllProductIdByOrderId(orderId);

        return new OrderResponseDTO(orderId,productIdList);
    }
}

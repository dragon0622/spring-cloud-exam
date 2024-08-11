package com.sparta.msa_exam.client.product.controller;

import com.sparta.msa_exam.client.product.service.ProductService;
import com.sparta.msa_exam.client.product.dto.ProductRequestDTO;
import com.sparta.msa_exam.client.product.dto.ProductResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    @Value("${server.port}")
    private String serverPort;  //나중에 header에 삽입

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductResponseDTO> getProducts(){
        List<ProductResponseDTO> responseDTOList = productService.findAll();
        return responseDTOList;
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody ProductRequestDTO productRequestDTO){
        productService.save(productRequestDTO);
    }
}

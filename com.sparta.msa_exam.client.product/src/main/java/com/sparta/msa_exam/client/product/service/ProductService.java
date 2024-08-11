package com.sparta.msa_exam.client.product.service;

import com.sparta.msa_exam.client.product.domain.Product;
import com.sparta.msa_exam.client.product.dto.ProductRequestDTO;
import com.sparta.msa_exam.client.product.dto.ProductResponseDTO;
import com.sparta.msa_exam.client.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product save(ProductRequestDTO productRequestDTO) {
        return productRepository.save(new Product(productRequestDTO));
    }

    public List<ProductResponseDTO> findAll() {
        List<Product> productList = productRepository.findAll();
        List<ProductResponseDTO> responseDTOList = new ArrayList<>();

        for (Product product : productList){
            responseDTOList.add(new ProductResponseDTO(product));
        }

        return responseDTOList;
    }
}

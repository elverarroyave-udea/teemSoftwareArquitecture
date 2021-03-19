package com.easymanager.easymanager.product.service;

import com.easymanager.easymanager.product.model.Product;

import com.easymanager.easymanager.product.service.model.ProductSaveCmd;

import java.util.List;

public interface ProductService {

    Product register(ProductSaveCmd productSaveRequest);

    List<Product> findAll();

    Product update(Long id, ProductSaveCmd productToUpdateCmd);

    void deleteById(Long id);

    Product findById(Long id);

}

package com.food.delivery.service;

import com.food.delivery.model.Product;

import java.util.List;

/**
 * Created by mz on 17/07/17.
 */
public interface ProductService {

    void create(Product p);

    Product read(String id);

    void update(Product p);

    void delete(String id);

    List<Product> readAll();
}

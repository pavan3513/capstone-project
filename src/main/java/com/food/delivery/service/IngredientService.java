package com.food.delivery.service;

import com.food.delivery.model.Ingredient;

import java.util.List;

/**
 * Created by mz on 14/07/17.
 */
public interface IngredientService {

    void create(Ingredient i);

    Ingredient read(String id);

    void update(Ingredient i);

    void delete(String id);

    List<Ingredient> readAll();
}

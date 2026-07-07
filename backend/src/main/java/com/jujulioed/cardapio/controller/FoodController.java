package com.jujulioed.cardapio.controller;

import com.jujulioed.cardapio.entity.Food;
import com.jujulioed.cardapio.repository.FoodRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRespository respository;

    @GetMapping
    public List<Food> getAll() {
        List<Food> foodList = respository.findAll();
        return foodList;
    }
}

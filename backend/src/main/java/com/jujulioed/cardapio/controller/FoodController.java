package com.jujulioed.cardapio.controller;

import com.jujulioed.cardapio.dtos.FoodRequestDTO;
import com.jujulioed.cardapio.dtos.FoodResponseDTO;
import com.jujulioed.cardapio.entity.Food;
import com.jujulioed.cardapio.repository.FoodRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRespository respository;

    // Configuração de cross origin apenas para estudo! Não se deve usar em produção!
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        respository.save(foodData);
    }

    // Configuração de cross origin apenas para estudo! Não se deve usar em produção!
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = respository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}

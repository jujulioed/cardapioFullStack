package com.jujulioed.cardapio.repository;

import com.jujulioed.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRespository extends JpaRepository<Food, Long> {
}

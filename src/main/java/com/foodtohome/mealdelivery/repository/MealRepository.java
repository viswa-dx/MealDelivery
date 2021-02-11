package com.foodtohome.mealdelivery.repository;

import com.foodtohome.mealdelivery.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface MealRepository extends JpaRepository<Meal, Long> {
    
    @Query(value = "SELECT * from MealDelivery where PRICE>?1",nativeQuery = true)
    public List<Meal> viewMealByPrice(BigDecimal price);

    @Query(value = "SELECT * from MealDelivery where MEALNAME>?1",nativeQuery = true)
    List<Meal> findMealByName(String meal);
}

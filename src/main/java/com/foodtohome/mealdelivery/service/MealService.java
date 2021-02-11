package com.foodtohome.mealdelivery.service;

import com.foodtohome.mealdelivery.model.Meal;

import java.math.BigDecimal;
import java.util.List;

public interface MealService {

    List<Meal> mealOrder(Meal meal,String userId);

    List<Meal> viewMealsWithinPrice(BigDecimal price);

    Boolean addNewMeal(Meal meal);
}

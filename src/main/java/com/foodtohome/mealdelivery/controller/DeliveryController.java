package com.foodtohome.mealdelivery.controller;

import com.foodtohome.mealdelivery.model.Meal;
import com.foodtohome.mealdelivery.service.MealService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/meal-delivery/v1")
public class DeliveryController {

    private static final Logger log = LoggerFactory.getLogger(DeliveryController.class);

    @Autowired
    MealService mealService;

    @PostMapping(value = "/meal-order")
    public String mealOrder(@RequestParam("userId") String userId, @RequestBody Meal meal) {

        mealService.mealOrder(meal,userId);

        return "Meal Delivered";
    }

    @GetMapping("/view-meals")
    public List<Meal> viewAvailbleMeals(@RequestParam BigDecimal price){

       List<Meal> meal = mealService.viewMealsWithinPrice(price);
        return meal;
    }

    @PostMapping("/add-meal")
    private Boolean addMeal(@RequestBody Meal meal){
        Boolean isMealAdded;

        isMealAdded = mealService.addNewMeal(meal);

        return isMealAdded;
    }
}

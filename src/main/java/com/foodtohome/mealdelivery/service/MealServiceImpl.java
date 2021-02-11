package com.foodtohome.mealdelivery.service;

import com.foodtohome.mealdelivery.model.Meal;
import com.foodtohome.mealdelivery.repository.MealRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.util.List;

public class MealServiceImpl implements MealService{

    private static final Logger log = LoggerFactory.getLogger(MealServiceImpl.class);

    @Autowired
    private MealRepository mealRepository;

    @Override
    public List<Meal> mealOrder(Meal meal, String userId) {



        return mealRepository.findMealByName(meal.getMealName());
    }

    @Override
    public List<Meal> viewMealsWithinPrice(BigDecimal price) {


        return mealRepository.viewMealByPrice(price);
    }

    @Override
    public Boolean addNewMeal(Meal meal) {

        Meal me = mealRepository.save(meal);

        return ObjectUtils.isEmpty(me) ? false : true ;
    }


}

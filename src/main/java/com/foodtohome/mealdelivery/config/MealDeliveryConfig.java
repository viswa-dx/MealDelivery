package com.foodtohome.mealdelivery.config;

import com.foodtohome.mealdelivery.service.MealService;
import com.foodtohome.mealdelivery.service.MealServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MealDeliveryConfig {

    private static final Logger log = LoggerFactory.getLogger(MealDeliveryConfig.class);

    @Bean
    public MealService MealService(){
        return new MealServiceImpl();
    }
}

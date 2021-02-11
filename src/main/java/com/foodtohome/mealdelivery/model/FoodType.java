package com.foodtohome.mealdelivery.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum FoodType {
    VEGETERIAN("Veg"),
    NON_VEGETERIAN("Non-Veg"),
    EGGETERIAN("Egg");

    FoodType(String value) {
    }
}

package com.foodtohome.mealdelivery.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "MealDelivery")
public class Meal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MEALNAME")
    private String mealName;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "DISTANCE")
    private BigDecimal distance;

    @Column(name = "TIME")
    private String time;

    @Column(name = "QUANTITY")
    private int quantity;


}

package com.spring.henallux.transAirPort.service;

import org.springframework.stereotype.Service;

@Service
public class Promotion {

    public double costReducItemQuantity(double totalCost, int sizeBasket){
        if(sizeBasket>=3){
            return (totalCost *= 0.9);
        }
        else
            return totalCost;
    }

}

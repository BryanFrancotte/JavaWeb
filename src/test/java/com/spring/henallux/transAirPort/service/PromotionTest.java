package com.spring.henallux.transAirPort.service;

import com.spring.henallux.transAirPort.model.OrderLine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PromotionTest {

    private Promotion promotion;

    @Before
    public void setUp() throws Exception {
        promotion=new Promotion();
    }

    @Test
    public void costReducItemQuantity() throws Exception {
        HashMap<String,OrderLine> listOrder=new HashMap<>();

        OrderLine orderLine1=new OrderLine(1,3.0,3);
        OrderLine orderLine2=new OrderLine(2,2.0,2);
        OrderLine orderLine3=new OrderLine(3,2.0,3);
        OrderLine orderLine4=new OrderLine(4,3.0,2);

        listOrder.put("line1",orderLine1);
        listOrder.put("line2",orderLine2);
        listOrder.put("line3",orderLine3);
        listOrder.put("line4",orderLine4);


        Assert.assertEquals(22.5,promotion.costReducItemQuantity(25,listOrder.size()),0.0);

    }

}
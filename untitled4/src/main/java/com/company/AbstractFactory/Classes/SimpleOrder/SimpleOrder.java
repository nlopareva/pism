package com.company.AbstractFactory.Classes.SimpleOrder;

import com.company.AbstractFactory.Interfaces.Order;

public class SimpleOrder implements Order {
    public void order(){
        System.out.println("Simple order was made!");
    }
}

package com.company.AbstractFactory.Classes.PreOrder;

import com.company.AbstractFactory.Interfaces.Order;

public class PreOrder implements Order {
    public void order(){
        System.out.println("Pre-order was made!");
    }
}

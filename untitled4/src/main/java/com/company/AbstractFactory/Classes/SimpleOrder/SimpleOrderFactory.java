package com.company.AbstractFactory.Classes.SimpleOrder;

import com.company.AbstractFactory.Interfaces.Order;
import com.company.AbstractFactory.Interfaces.bakery;

public class SimpleOrderFactory implements bakery {
    public Order makeOrder(){
        return new SimpleOrder();
    }
}

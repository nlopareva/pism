package com.company.AbstractFactory.Classes.PreOrder;

import com.company.AbstractFactory.Interfaces.Order;
import com.company.AbstractFactory.Interfaces.bakery;

public class PreOrderFactory implements bakery {
    public Order makeOrder(){
        return new PreOrder();
    }
}

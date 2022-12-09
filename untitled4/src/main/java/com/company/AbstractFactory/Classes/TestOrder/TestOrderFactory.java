package com.company.AbstractFactory.Classes.TestOrder;

import com.company.AbstractFactory.Interfaces.Order;
import com.company.AbstractFactory.Interfaces.bakery;

public class TestOrderFactory implements bakery {

    @Override
    public Order makeOrder() {
        return new TestOrder();
    }
}

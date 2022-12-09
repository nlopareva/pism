package com.company.AbstractFactory.Classes.TestOrder;

import com.company.AbstractFactory.Interfaces.Order;

public class TestOrder implements Order {
    @Override
    public void order() {
        System.out.println("Client is null! Test failed!");
    }
}

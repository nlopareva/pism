package com.company.AbstractFactory;

import com.company.AbstractFactory.Interfaces.Order;
import com.company.AbstractFactory.Interfaces.bakery;

public class Client {
    private Order cake;
    public Client(bakery factory){
        cake = factory.makeOrder();
    }

    public void bake(){
        cake.order();
    }
}

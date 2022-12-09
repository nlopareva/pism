package com.company.Component;


import java.util.ArrayList;

public class CompositeBakery implements bakery{


    Cake cake = new Cake();
    ApplePie applePie = new ApplePie();
    ArrayList<String> total = new ArrayList<>();

    @Override
    public int getPrice(int a, int b) {

       return a + b;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void makeOrder() {
        String add = cake.getNameBakery() + applePie.getNameBakery();
        total.add(add);
    }


}

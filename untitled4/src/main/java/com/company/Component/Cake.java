package com.company.Component;

public class Cake {
    int price;

    public Cake() {
    }

    public Cake(int price) {
        this.price = price;
    }

    public int getPriceCake() {
        return price;
    }

    public String getNameBakery(){
        return String.valueOf(getClass());
    }
}

package com.company.Component;

public class ApplePie {

    int price;

    public ApplePie() {
    }

    public ApplePie(int price) {
        this.price = price;
    }

    public int getPricePie() {

        return price;
    }

    public String getNameBakery(){
        return String.valueOf(getClass());
    }
}

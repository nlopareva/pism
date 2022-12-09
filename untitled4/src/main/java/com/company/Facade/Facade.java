package com.company.Facade;

public class Facade {

    Cake cake = new Cake();
    Muffin muffin = new Muffin();
    public int totalWaiting(int a, int b){
        return  cake.bake(a) + muffin.bake(b);
    }

}

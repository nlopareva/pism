package com.company.Builder.Classes;

import com.company.Builder.Interfaces.Builder;

public class CakeBuilder implements Builder {

    Cake cake = new Cake();


    @Override
    public void bake() {
        System.out.println("Choice: Cake");
    }



    @Override
    public void getInfo(String string) {
        cake.setType(string);
       System.out.println("Type: " + cake.getType());
    }




}

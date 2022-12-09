package com.company.Builder.Classes;

import com.company.Builder.Interfaces.Builder;


public class MuffinBuilder implements Builder {

    Muffin muffin = new Muffin("");


    @Override
    public void bake() {
        System.out.println("Choice: Muffin");
    }



    @Override
    public void getInfo(String string) {
        muffin.setType(string);
        System.out.println("Type: " + muffin.getType());
    }



}

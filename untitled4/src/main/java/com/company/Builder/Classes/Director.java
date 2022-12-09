package com.company.Builder.Classes;

public class Director {
    CakeBuilder cakeBuilder;
    MuffinBuilder muffinBuilder;
    public void MakeCake(){
      cakeBuilder= new CakeBuilder();
      cakeBuilder.bake();

    }

    public void MakeMuffin(){
        muffinBuilder = new MuffinBuilder();
        muffinBuilder.bake();

    }




    public void CakeDetails(String string){
        cakeBuilder.getInfo(string);

    }

    public void MuffinDetails(String string){
        muffinBuilder.getInfo(string);
    }
}

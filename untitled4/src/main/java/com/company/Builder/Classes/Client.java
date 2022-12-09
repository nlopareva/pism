package com.company.Builder.Classes;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws NullPointerException {

        Scanner in = new Scanner(System.in);

        System.out.println("What do you want to bake?" + "\n" + "cake or muffin");
        String type = in.nextLine().toLowerCase();

        while (true) {
            if (type.contains("cake")) {
                Director director = new Director();

                System.out.println("Addition: choco or vanilla");
                String add = in.nextLine().toLowerCase();
                if (add.contains("choco") || add.contains("vanilla")) {
                    director.MakeCake();
                    director.CakeDetails(add);
                    break;
                } else {
                    System.out.println("Please, chose addition again");

                }
            } else if (type.contains("muffin")) {
                Director director1 = new Director();

                System.out.println("Addition:");
                String add = in.nextLine().toLowerCase();
                if (add.contains("choco") || add.contains("vanilla")) {
                    director1.MakeMuffin();
                    director1.MuffinDetails(add);
                    break;
                }else {
                    System.out.println("Please, chose addition again");

                }
            }



        }
    }

}

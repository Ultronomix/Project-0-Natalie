package com.revature.BestProject0Natalie;
import java.util.Scanner;
public class Bird extends Legendaries {

    String name;
    String legs;
    String color;
    String wings;
    public Bird(String bird) {
    }
    public void LegendarypokemonChoice() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Which legendary bird do you think you'll get? \n Please select a Flying type:\n");

        System.out.println("1) Electric\n"
                + "2) Ground\n"
                + "3) Fire\n"
                + "You have 2 options!");
        System.out.println();

        int option = sc.nextInt();
        switch (option) {

            case 1:
                System.out.println("You picked Zapdos!");
                break;
            case 2:
                System.out.println("You picked Landorus!");
                break;
            case 3:
                System.out.println("1) Moltres\n"
                        + "2) Ho-oh\n");
                break;
        }
        System.out.println();
        int option1 = sc.nextInt();
        switch (option1) {
            case 1:
                System.out.println("You picked Moltres!");
                break;
            case 2:
                System.out.println("You picked Ho-oh!");
                break;
        }
        sc.close();
    }

}


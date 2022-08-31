package com.revature.BestProject0Natalie;
import java.util.Scanner;
class Fourlegs extends Legendaries {
    String name;
    String legs;
    String color;
    String wings;
    public Fourlegs(String fourlegs) {
    }
    public void LegendarypokemonChoice() {
        Scanner s = new Scanner(System.in);

        System.out.println("Which Legendary do you want? \n Please select a type:\n");

        System.out.println("1) Water\n"
                         + "2) Water/Fire\n"
                         + "3) Electric\n"
                         + "4) Ice/Psychic/ghost\n"
                         + "5) Psychic/steel\n"
                         + "6) Normal\n"
                         + "7) Normal\n"
        );
        System.out.println();

        int decision = s.nextInt();
        switch (decision) {
            case 1:
                System.out.println("You picked Suicune!");
                break;
            case 2:
                System.out.println("You picked Volcanion!");
                break;
            case 3:
                System.out.println("You picked Raikou!");
                break;
            case 4:
                System.out.println("You picked Calyrex/Glastrier!");
                break;
            case 5:
                System.out.println("You picked Silvally!");
                break;
            case 6:
                System.out.println("You picked Solgaleo!");
                break;
            case 7:
                System.out.println("You picked Arceus!");
                break;
        }
        s.close();
    }
}
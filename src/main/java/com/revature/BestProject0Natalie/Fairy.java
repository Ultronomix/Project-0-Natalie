package com.revature.BestProject0Natalie;

import java.util.Scanner;
class Fairy extends Legendaries {

    String name;
    String legs;
    String color;
    String wings;

    public Fairy(String fairy) {
        super();
    }

    public void LegendarypokemonChoice() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Which Legendary do you want? \n Please select a Fariy type:\n");

        System.out.println("1) Physic\n"
                + "2) Electric\n"
                + "3) Water\n"
                + "4) Fairy\n"
                + "5) Steel\n"
                + "6) Rock\n"
                + "7) Grass\n"
                + "8) Flying\n");
        System.out.println();

        int selection = scan.nextInt();
        switch (selection) {
            case 1:
                System.out.println("You picked Tapu Lele!");
                break;
            case 2:
                System.out.println("You picked Tapu Koko!");
                break;
            case 3:
                System.out.println("You picked Tapu Fini!");
                break;
            case 4:
                System.out.println("You picked Xerneas!");
                break;
            case 5:
                System.out.println("You picked Zacian!");
                break;
            case 6:
                System.out.println("You picked Diancie!");
                break;
            case 7:
                System.out.println("You picked Tapu Bulu!");
                break;
            case 8:
                System.out.println("You picked Enamorus!");
                break;
            case 9:
                LegendarypokemonChoice();
                break;
        }
        scan.close();
    }
}

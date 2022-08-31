package com.revature.BestProject0Natalie;

import java.util.Scanner;
public class TwoLegsOrLess extends Legendaries {
    String name;
    String legs;
    String color;
    String wings;
    public TwoLegsOrLess(String twoLegsOrLess) {
    }
    public void LegendarypokemonChoice() {

        Scanner s = new Scanner(System.in);

        System.out.println("Which Legendary do you want? \n Please select a type:\n");

        System.out.println("1) Water\n"
                + "2) Electric\n"
                + "3) Fire\n"
                + "4) Fighting\n"
                + "5) Fairy\n"
                + "6) Steel'\n"
                + "7) Rock\n"
                + "8) Ice\n"
                + "9) Normal\n"
                + "10) Psychic/ghost\n"
        );
        System.out.println();

        int decision = s.nextInt();
        switch (decision) {
            case 1:
                System.out.println("You picked Kyogre!");
                break;
            case 2:
                System.out.println("You picked Zeraora!");
                break;
            case 3:
                System.out.println("You picked Groudon!");
                break;
            case 4:
                System.out.println("You picked Urshifu!");
                break;
            case 5:
                System.out.println("You picked Enamorus!");
                break;
            case 6:
                System.out.println("You picked Registeel!");
                break;
            case 7:
                System.out.println("You picked Regirock!");
                break;
            case 8:
                System.out.println("You picked Regice!");
                break;
            case 9:
                System.out.println("You picked Regigigas!");
                break;
            case 10:
                System.out.println("You picked Lunala!");
                break;
        }
            s.close();
        }
    }


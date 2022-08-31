package com.revature.BestProject0Natalie;
import java.util.*;
import java.util.Scanner;

public class WelcomeMenu {

    public WelcomeMenu(String welcomeMenu) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Menu for Legendary types. " +
                "Which Legendairy is best suited for you? Please select a type:\n");
        System.out.println("1) Bird types/\n"
                + "2) Four legs/muiltilegs\n"
                + "3) Two legs or less/psychic/fins/no legs\n"
                + "4) Fairy types\n"
        );

        int choice = sc.nextInt();
        Bird birdy = new Bird("Bird");
        switch (choice) {
            case 1:
                System.out.println("entered bird");
                birdy.LegendarypokemonChoice();
        }
        Fourlegs fourlegs = new Fourlegs("Fourlegs");
        switch (choice) {
            case 2:
                System.out.println("entered fourlegs");
                fourlegs.LegendarypokemonChoice();
        }
        TwoLegsOrLess nolegs = new TwoLegsOrLess("TwoLegsOrLess");
        switch (choice) {
            case 3:
                System.out.println("entered nolegs");
                nolegs.LegendarypokemonChoice();
        }
        Fairy fairy = new Fairy("Fairy");
        switch (choice) {
            case 4:
                System.out.println("entered fairy");
                fairy.LegendarypokemonChoice();
        }

        WelcomeMenu menu = new WelcomeMenu("WelcomeMenu");
        switch (choice) {
            case 5:
                System.out.println("entered nothing");
                menu.LegendarypokemonChoice();
                sc.close();
        }

        ArrayList<Legendaries> legendaries2 = new ArrayList<Legendaries>();

        String name;
        String legs;
        String color;
        String wings;


    }

    public static void LegendarypokemonChoice() {
    }

}
package com.codegym;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.nextLine();

        char letter = 0;
        boolean valid = false;
        do {
            System.out.println("Please enter a letter you want to count: ");
            String tempLetter = input.nextLine();
            if (tempLetter.length() == 1) {
                letter = tempLetter.charAt(0);
                valid = true;
            }
        } while (!valid);

        System.out.println(countLetter(str, letter));
    }

    public static String countLetter(String str, char letter) {
        int count = 0;

        String myStr = str.toLowerCase();
        char myLetter = Character.toLowerCase(letter);

        for (int i = 0; i < myStr.length(); i++) {
            if (myLetter == myStr.charAt(i)) {
                count++;
            }
        }
        return "The times that the letter '" + letter + "' appeared is " + count;
    }
}

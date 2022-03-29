package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number between 0 and 1000: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //check validity
        if (num < 0 || num > 999) {
            System.out.println("Out of range.");
        }

        //get numbers
        int thirdDigit = num / 100;
        int secondDigit = num % 100 / 10;
        int firstDigit = num % 10;

        String outputThirdDigit = "";
        String outputSpecial = "";
        String outputNormal = "";
        String result;

//get special cases between 0 and 19
        switch (secondDigit) {
            case 0:
                switch (firstDigit) {
                    case 0:
                        outputSpecial = "zero";
                        break;
                    case 1:
                        outputSpecial = "one";
                        break;
                    case 2:
                        outputSpecial = "two";
                        break;
                    case 3:
                        outputSpecial = "three";
                        break;
                    case 4:
                        outputSpecial = "four";
                        break;
                    case 5:
                        outputSpecial = "five";
                        break;
                    case 6:
                        outputSpecial = "six";
                        break;
                    case 7:
                        outputSpecial = "seven";
                        break;
                    case 8:
                        outputSpecial = "eight";
                        break;
                    case 9:
                        outputSpecial = "nine";
                        break;
                }
                break;
            case 1:
                switch (firstDigit) {
                    case 0:
                        outputSpecial = "ten";
                        break;
                    case 1:
                        outputSpecial = "eleven";
                        break;
                    case 2:
                        outputSpecial = "twelve";
                        break;
                    case 3:
                        outputSpecial = "thirteen";
                        break;
                    case 4:
                        outputSpecial = "fourteen";
                        break;
                    case 5:
                        outputSpecial = "fifteen";
                        break;
                    case 6:
                        outputSpecial = "sixteen";
                        break;
                    case 7:
                        outputSpecial = "seventeen";
                        break;
                    case 8:
                        outputSpecial = "eighteen";
                        break;
                    case 9:
                        outputSpecial = "nineteen";
                        break;
                }
                break;
        }

//get second digit and first digit in cases > 19
        switch (secondDigit) {
            case 2:
                outputNormal = "twenty";
                break;
            case 3:
                outputNormal = "thirty";
                break;
            case 4:
                outputNormal = "forty";
                break;
            case 5:
                outputNormal = "fifty";
                break;
            case 6:
                outputNormal = "sixty";
                break;
            case 7:
                outputNormal = "seventy";
                break;
            case 8:
                outputNormal = "eighty";
                break;
            case 9:
                outputNormal = "ninety";
                break;
        }

        if (secondDigit >= 2) {
            switch (firstDigit) {
                case 1:
                    outputNormal += " one";
                    break;
                case 2:
                    outputNormal += " two";
                    break;
                case 3:
                    outputNormal += " three";
                    break;
                case 4:
                    outputNormal += " four";
                    break;
                case 5:
                    outputNormal += " five";
                    break;
                case 6:
                    outputNormal += " six";
                    break;
                case 7:
                    outputNormal += " seven";
                    break;
                case 8:
                    outputNormal += " eight";
                    break;
                case 9:
                    outputNormal += " nine";
                    break;
            }
        }


//get third digit
            switch (thirdDigit) {
                case 1:
                    outputThirdDigit = "One";
                    break;
                case 2:
                    outputThirdDigit = "Two";
                    break;
                case 3:
                    outputThirdDigit = "Three";
                    break;
                case 4:
                    outputThirdDigit = "Four";
                    break;
                case 5:
                    outputThirdDigit = "Five";
                    break;
                case 6:
                    outputThirdDigit = "Six";
                    break;
                case 7:
                    outputThirdDigit = "Seven";
                    break;
                case 8:
                    outputThirdDigit = "Eight";
                    break;
                case 9:
                    outputThirdDigit = "Nine";
                    break;
            }

        if (thirdDigit == 0 && secondDigit < 2) {
            result = outputSpecial;
        } else if (thirdDigit == 0) {
            result = outputNormal;
        } else if (secondDigit < 2) {
            result = outputThirdDigit + " hundred and " + outputSpecial;
        } else {
            result = outputThirdDigit + " hundred and " + outputNormal;
        }

        System.out.println(result);
    }
}

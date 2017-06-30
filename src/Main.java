/*
making a dice generator

*CHECKLIST
* create prompts
* initialize variables
* validate the input
*       must use integers for whole numbers
* think about how to get random generator
*       class or math?
* need to use static methods to generate random numbers
 */


import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in); //made this static so I can use it throughout the code, might have been a mistake.

    public static void main(String[] args) {


        welcomingStatement();
        diceRoll(sides());
        userContinue();

    }


    private static void welcomingStatement() {
        System.out.println("I exist to roll dice.");
        System.out.println("How many sides should both dice have?");
    }

    private static int sides() {
        while (!scan.hasNextInt()) {
            System.out.println("That isn't a number!");
            scan.nextLine();
        }
        int sides = scan.nextInt();

        return sides;
    }

    private static int diceRoll(int diceRoll) {          //sides get assigned to diceRoll
        Random randomNumberGen = new Random();
        System.out.println("You rolled...");
        System.out.println("\tDice 1:  " + (randomNumberGen.nextInt(diceRoll) + 1));
        System.out.println("\tDice 2:  " + (randomNumberGen.nextInt(diceRoll) + 1) + "\n");
        return diceRoll;
    }

    private static void userContinue() {
        System.out.println("Roll again? (y/n)");
        String userChoice = scan.next();
        if (userChoice.equalsIgnoreCase("y")) {
            codeLoop();
        } else {
            System.out.println("Goodbye!");
        }

    }

    private static void codeLoop() {
        welcomingStatement();
        diceRoll(sides());
        userContinue();
    }

}

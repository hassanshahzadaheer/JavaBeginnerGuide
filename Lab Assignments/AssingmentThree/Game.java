package assingmentThree;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Scanner userInput = new Scanner(System.in);
    private final Random random = new Random();
    private int storeRandom = 0;
    private int winChance = 0;
    private int number = 0;
    private boolean bool = true;
    private int loss = 3;
    private char getChar;

    // game begin with this method
    public char playGame() {
        do {
            bool = false;
            System.out.print("Do you want to play game press Y/y : ");
            getChar = userInput.next().charAt(0);

            if (getChar == 'y' || getChar == 'y') {
                randomNumber();
                System.out.print("Enter a number : ");
                number = userInput.nextInt();
                if (number == storeRandom) {
                    System.out.println("Congratulations! You Won . . . . ");
                    winChance++;
                    bool = true;
                } else {
                    lossGame();
                }
                if (winChance >= 3) {
                    System.out.println("Your cradit is " + winChance);
                    bool = true;
                    addCradit();
                }

            } else {
                System.out.println("invalid input");
                exitGame(false);
            }
        } while (bool);

        return getChar;
    }

    // this method generate random number 
    public int randomNumber() {
        storeRandom = (random.nextInt(10) + 1);
        return storeRandom;
    }

    // this method add the cradit to the game
    public void addCradit() {
        System.out.print("Press 1 to add cradit : ");
        number = userInput.nextInt();
        if (winChance == 10) {
            System.out.println("Sorry! Your all cradits are over Thanks for playing! ");
            bool = false;
        }
    }

    // if user loss game 
    public void lossGame() {
        System.out.println("Oops! Your number is not match with system number . . . ");
        bool = true;
        loss--;
        System.out.println("You have " + loss + " chance ");
        if (loss == 0) {
            System.out.println("Sorry! Game is over You have no chance . . . ");
            bool = false;
        }

    }

    // this method exit the game
    public boolean exitGame(boolean getBool) {
        if (getBool) {
            bool = false;
        }
        return false;
    }

}

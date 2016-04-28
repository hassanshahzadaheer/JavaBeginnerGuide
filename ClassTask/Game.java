/**
 * Game.java
 * 
 * Hassan Shahzad aheer
 * hassanshahzadaheer@gmail.com
 * 
 * This is the 1st class task to take a user input and make a fun with it.
 * 23 - April - 2016
 **/
 import java.util.Scanner;
 import java.io.IOException;
 public class Game {
     public static void main (String args[]) {
         
         Scanner userInput = new Scanner(System.in);
         int count = 3;
         char chance = '0';
         int number = 0;
         
         try {
                while (true) {
                    System.out.print("Enter a number : ");
                    
                    number = Integer.parseInt(System.console().readLine());
         
                    if (number >= 0 && number <= 10) {
                        
                    System.out.println("Congratulations! You Win ");
                    break;   
                } else {
                    System.out.println("Sorry! You Loss ");
                    
                    
                    System.out.println("Do you want to play again press y/Y to start");
                    //char chance = userInput.next().charAt(0);
                   chance = (char) System.in.read();
                
                    if (chance == 'y' || chance == 'Y') {
                        count --;
                        System.out.println("You have "+count+ " Chance");  
                    
                    if (count == 0) {
                            System.out.println("Sorry! You have no chance to play");
                            break;
                        }
                            continue;  
                    }
                }    
            }
        } catch (Exception e) {
                System.out.println(e);
         }
     }
 }
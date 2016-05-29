/**
 * CharacterCount.java
 * 
 * Hassan Shahzad aheer
 * hassanshahzadaheer@gmail.com
 * 
 * This is the 3rd class task to take a user input and check how many times Character comes in
 * user input.
 * 22 - May - 2016
 **/
 
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a String to found character : ");
        String data = userInput.next();

        System.out.print("Enter a character you want to found : ");
        char charFound = userInput.next().charAt(0);

        int found = 0, check;

        for (int i = 0, n = data.length(); i < n; i++) {
            check = data.charAt(i);
            if (check == charFound) {
                found++;
            }
        }
        System.out.println("Your Input : " + data);
        
        System.out.println(charFound + " is appears  "+ found + " times " + " in " +data);
    }
}

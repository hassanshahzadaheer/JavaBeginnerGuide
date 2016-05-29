/**
 * DigitToString.java
 * 
 * Hassan Shahzad aheer
 * hassanshahzadaheer@gmail.com
 * 
 * This is the 3st class task to take a user input as digit and convert into string.
 * 15 - May - 2016
 **/
 import java.util.Scanner;

public class DigitToString {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num, numberOne, numberTwo;
        
        String tenth[] = {"","","Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninty"};
        String unit[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};

        System.out.print("Enter Number between 1 - 99 : ");
        num = userInput.nextInt();
            
        if ((num <= 1) || (num >= 100)) {
            System.out.println("Wrong Input");
        } else if ((num >= 1) && (num <= 19)) {
             System.out.println(unit[num]);
        } else if ((num >= 20) && (num <= 99)) {
            numberOne = num / 10;
            numberTwo = num % 10;
            System.out.println(tenth[numberOne] + " " + unit[numberTwo]);
         }
        
        
    }
}

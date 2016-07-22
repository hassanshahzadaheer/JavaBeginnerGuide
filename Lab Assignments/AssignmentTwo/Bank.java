package bankmanagement;

import java.util.Scanner;

public class Bank {

    private final Customer customers = new Customer();
    private final Scanner userInput = new Scanner(System.in);
    private double blance;
    private String name;
    private String accountNumber;
    private double withDraw;

    public void addCustomer() {
        System.out.print("Account holder name : ");
        name = userInput.nextLine();
        customers.setName(name);

        System.out.print("Account Number : ");
        customers.setAccountNumber(userInput.next());
    }

    public void deposit() {
        // addCustomer();
        System.out.print("Add Blance : ");
        blance = userInput.nextDouble();
        customers.display();
    }

    public void withdraw() {
        System.out.print("Enter amount : ");
        withDraw = userInput.nextDouble();

        System.out.println("before with draw " + blance);
        double leftblance = (blance - withDraw);

        if (blance > withDraw) {
            System.out.println("Thank you, Your payment was successful!");
            System.out.println("Blance Left : " + leftblance);

        } else {
            System.out.println("Sorry! You are unable to make this Transaction!");
        }

    }

}

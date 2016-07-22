package bankmanagement;

public class Customer {

    private String name;
    private String accountNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void display() {
        System.out.println("Account Holder Name : " + this.name);
        System.out.println("Account Number : " + this.accountNumber);

    }
}

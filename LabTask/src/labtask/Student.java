package labtask;

public class Student extends Person {

    private String rollNumber;

    public Student() {
        super(null, 0);
    }

    public Student(String name, int age, String rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String subject) {
        this.rollNumber = subject;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.printf("\tRollNumber");
        
    }

 

}

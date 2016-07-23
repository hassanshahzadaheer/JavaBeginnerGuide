package assignmentone;

import java.util.Scanner;

public class Teacher extends Person {

    private final Scanner userInput = new Scanner(System.in);
    private final Teacher teacher[] = new Teacher[2];
    private String name;
    private int age;
    private String expirance;
    private String subject;

    public Teacher() {
        super(null, 0);
    }

    public Teacher(String expirance, String subject, String name, int age) {
        super(name, age);
        this.expirance = expirance;
        this.subject = subject;
    }

    public String getExpirance() {
        return expirance;
    }

    public void setExpirance(String expirance) {
        this.expirance = expirance;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addTeacher() {

        do {
            System.out.println("1- Add Teacher ");
            System.out.println("2- View Teacher List ");
            System.out.println("3- Exit ");

            System.out.print("Enter a key :");
            int list = userInput.nextInt();
            if (list == 1) {
                System.out.println("\t ===  Add Teacher === ");
                for (int i = 0; i < teacher.length; i++) {
                    System.out.print("Enter Teacher Name : ");
                    name = userInput.next();
                    System.out.print("Enter Age : ");
                    age = userInput.nextInt();
                    System.out.print("Enter Experiance : ");
                    subject = userInput.next();
                    System.out.print("Enter Subject : ");
                    expirance = userInput.next();
                    teacher[i] = new Teacher(expirance, subject, name, age);

                    System.out.println(name + " Successfully Add !\n");
                }

            }
            if (list == 2) {
                for (Teacher teachers : teacher) {
                    teachers.display();
                    System.out.println("\n\t" + teachers.getName() + "\t\t" + teachers.getAge() + "\t\t" + teachers.getExpirance() + "\t\t" + teachers.getSubject());

                }

            }
            if (list == 3) {
                break;
            }
        } while (true);
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("\tExpirance\tSubject");

    }

}

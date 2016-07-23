package assignmentone;

import java.util.Scanner;

public class Student extends Person {

    private final Student studnet[] = new Student[2];
    private final Scanner userInput = new Scanner(System.in);

    private int rollNumber;

    public Student() {
        super(null, 0);
    }

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int subject) {
        this.rollNumber = subject;
    }

    public void addStudent() {

        do {
            System.out.println("1- Add Student ");
            System.out.println("2- View Studetn List ");
            System.out.println("3- Update List");
            System.out.println("4- Exit ");

            System.out.print("Enter a key :");
            int list = userInput.nextInt();
            if (list == 1) {
                System.out.println("\t ===  Add Student === ");
                for (int i = 0; i < studnet.length; i++) {
                    System.out.print("Enter Student Id : ");
                    int id = userInput.nextInt();
                    System.out.print("Enter Student Name : ");
                    String name = userInput.next();
                    System.out.print("Enter Age : ");
                    int age = userInput.nextInt();

                    studnet[i] = new Student(name, age, id);
                    System.out.println(name + " Successfully Add !\n");
                }

            }
            if (list == 2) {
                display();
                studentList();

            }
            if (list == 3) {
                search(rollNumber);
            }
            if (list == 4) {
                break;
            }

        } while (true);
    }

    public void studentList() {
        for (Student student1 : studnet) {

            System.out.println("\n\t" + student1.getRollNumber() + "\t" + student1.getName() + "\t" + student1.getAge());
        }

    }

    public void search(int id) {
        System.out.print("Select student by ID: ");
        int getId = userInput.nextInt();
        boolean found = false;
        for (Student s : studnet) {
            if (s.rollNumber == getId && !found) {
                update(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student with that ID.");
        }
    }

    public void update(Student s) {

        boolean run = true;
        while (run) {
            System.out.println("1- Change Name  ");
            System.out.println("2- Change ID ");
            System.out.println("3- Change Age ");
            System.out.println("4- Delete Record ");
            System.out.println("5- Done ");
            int option = userInput.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter New Name > ");
                    s.setName(userInput.next());
                    break;
                case 2:
                    System.out.print("Enter New ID > ");
                    s.setRollNumber(userInput.nextInt());
                    break;
                case 3:
                    System.out.print("Enter New Age > ");
                    s.setAge(userInput.nextInt());
                    break;
                case 4:
                    for (int i = 0; i < studnet.length; i++) {
                        if (studnet[i] == s) {
                            System.out.println("recourd is delete ");
                            
                        }
                    }
                    break;
                case 5:
                    display();
                    studentList();
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void display() {
        System.out.printf("\tRoll Number\t");
        super.display();
    }

}

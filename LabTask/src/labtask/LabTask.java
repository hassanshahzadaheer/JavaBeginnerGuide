package labtask;

import java.util.Scanner;

public class LabTask {

    public static void main(String[] args) {

        System.out.println("\t === *** WELCOME TO STUDENT MANAGEMENT SYSTEM *** === \n");
        System.out.println("PLEASE FOLLOW THE INSTRACTION \n");

        System.out.println("1- Student Department ");
        System.out.println("2- Teacher Department ");
        System.out.println("3- Exit ");

        Scanner input = new Scanner(System.in);

        Student student[] = new Student[2];
        Teacher teacher[] = new Teacher[2];

        // taking input form user
        int list;
        String name;
        int age;
        String roll;
        String subject;
        String experance;

        System.out.print("Enter a key :");
        list = input.nextInt();
        boolean run = true;
        if (list == 1) {

            do {
                System.out.println("1- Add Student ");
                System.out.println("2- View Studetn List ");
                System.out.println("3- Exit ");

                System.out.print("Enter a key :");
                list = input.nextInt();
                if (list == 1) {
                    System.out.println("\t ===  Add Student === ");
                    for (int i = 0; i < student.length; i++) {
                        System.out.print("Enter student Name : ");
                        name = input.next();
                        System.out.print("Enter Age : ");
                        age = input.nextInt();
                        System.out.print("Enter Roll : ");
                        roll = input.next();

                        student[i] = new Student(name, age, roll);
                        System.out.println(name + " Successfully Add !\n");
                    }
                    
                }
                if (list == 2) {
                    for (Student student1 : student) {
                        student1.display();
                        System.out.println("\n\t"+student1.getName()+"\t"+student1.getAge()+"\t"+student1.getRollNumber());
                    }
                }
                if (list == 3) {
                    run = false;
                }

            } while (run);

        } else if (list == 2) {
            do {
                System.out.println("1- Add Teacher ");
                System.out.println("2- View Teacher List ");
                System.out.println("3- exit ");

                System.out.print("Enter a key :");
                list = input.nextInt();
                if (list == 1) {
                    System.out.println("\t ===  Add Teacher === ");
                    for (int i = 0; i < student.length; i++) {
                        System.out.print("Enter Teacher Name : ");
                        name = input.next();
                        System.out.print("Enter Age : ");
                        age = input.nextInt();
                        System.out.print("Enter Experiance : ");
                        subject = input.next();
                        System.out.print("Enter Subject : ");
                        experance = input.next();

                        teacher[i] = new Teacher(experance, subject, name, age);
                        
                        System.out.println(name + " Successfully Add !\n");
                    }
                    
                }
                if (list == 2) {
                    for (Teacher teachers : teacher) {
                        teachers.display();
                         System.out.println("\n\t"+teachers.getName()+"\t\t"+teachers.getAge()+"\t\t"+teachers.getExpirance()+"\t\t"+teachers.getSubject());
                        
                    }
                }
                if (list == 3) {
                    run = false;
                }

            } while (run);
        }

    }

}

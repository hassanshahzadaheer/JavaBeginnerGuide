/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maxito
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static Teacher teacher[] = new Teacher[2];

    public static void main(String[] args) {
        System.out.println("\tWELCOME TO STUDENT MANAGEMENT SYSTEM");

        System.out.println("\nPLEASE FOLLOW THE FOLLOWING INSTRUCTION");

        Scanner userInput = new Scanner(System.in);

        // get information for user
        String name = null;
        int age = 0;
        String subject = null;
        String exp = null;
        int list = 4;
        do {
            System.out.println("1- Add Teacher ");
            System.out.println("2- View Student ");
            System.out.println("3- Exit ");

            System.out.print("Enter key : ");
            list = userInput.nextInt();
            if (list == 1) {
                System.out.println("\t === ADD TEACHER === ");
                for (int i = 0; i < teacher.length; i++) {
                    System.out.print("Enter Teacher Name : ");
                    name = userInput.next();
                    System.out.print("Enter Age : ");
                    age = userInput.nextInt();
                    System.out.print("Enter Subject : ");
                    subject = userInput.next();
                    System.out.print("Enter Experance : ");
                    exp = userInput.next();

                    teacher[i] = new Teacher(name, age, subject, exp);
                    teacher[i].display();

                }

            } else if (list == 2) {
                System.out.println("\tName\t\tAge\tSubject\tExperiance");
                for (Teacher teacher1 : teacher) {

                    System.out.println(teacher1.display());

                }
            }

        } while (list < 3);

    }

}

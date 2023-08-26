package org.example;

import classes.services;
import classes.student;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    static services intse;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Viewaction();
        while (true) {
            String title = sc.nextLine();
            student student;
            switch (title) {
                case "add":
                    student= scan();
                    intse.createstudent(student);
                    break;
                case "list":

                    break;

                case "delete":
                    scan();
                    break;

            }


        }


    }
    public static   void Viewaction(){

        System.out.println("Please Select one of the following :");
        System.out.println("To add a new intern to the database, write 'add'");
        System.out.println("To list all intern in the database, write 'list'");
        System.out.println("To delete an intern , write 'delete'");


    }

    public static student scan(){


        System.out.println("Please enter classes.classes.student age");
        int age =  Integer.parseInt(sc.nextLine());
        System.out.println("Please enter classes.classes.student name");
        String name = sc.nextLine();
        System.out.println("Please enter classes.classes.student unversity");
        String unversity = sc.nextLine();
        return new student(name,age,unversity);

    }

}
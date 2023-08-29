package org.example;


import classes.StudentRepository;
import classes.StudentService;
import classes.Student;



import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static StudentService studentService;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        StudentRepository studentRepository=new StudentRepository();
        studentService =new StudentService(studentRepository);
        Viewaction();
        while (true) {
            String title = scanner.nextLine();

            switch (title) {
                case "add":
                    studentService.createstudent(scanStudent());
                    break;
                case "list":
                    studentService.list();

                    break;
                case "update":
                int id=ScanId();
                    studentService.updatemain(id);
                    break;
            }


        }


    }

    public static void Viewaction() {

        System.out.println("Please Select one of the following :");
        System.out.println("To add a new intern to the database, write 'add'");
        System.out.println("To list all intern in the database, write 'list'");
        System.out.println("To delete an intern , write 'delete'");


    }

    public static Student scanStudent() {


        System.out.println("Please enter classes.classes.student age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter classes.classes.student name");
        String name = scanner.nextLine();
        System.out.println("Please enter classes.classes.student unversity");
        String unversity = scanner.nextLine();
        return new Student(name, age, unversity);

    }
public static int ScanId(){
    System.out.println("Please enter classes.classes.student ID TO UBDATE");
    int id = Integer.parseInt(scanner.nextLine());
    return id;

}


}
package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

    public static void main(String[] args) {

        System.out.println("Enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new  Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n] + "\n");
        }
    }
}

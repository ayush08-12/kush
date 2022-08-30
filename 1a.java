import java.io.*;
import java.util.Scanner;

class Student {
    String usn, name, branch;
    long phone;

    Student(String u, String n, String b, long p) {
        usn = u;
        name = n;
        branch = b;
        phone = p;
    }

    void display() {
        System.out.println();
        System.out.println("USN: " + usn);
        System.out.println("NAME: " + name);
        System.out.println("BRANCH: " + branch);
        System.out.println("PHONE: " + phone);
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int i;
        Student s[] = new Student[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the details of student no: " + (i + 1));
            System.out.println("Enter the USN: ");
            String us = sc.next();
            System.out.println("Enter the NAME: ");
            String na = sc.next();
            System.out.println("Enter the BRANCH: ");
            String br = sc.next();
            System.out.println("Enter the PHONE NO: ");
            long ph = sc.nextLong();
            s[i] = new Student(us, na, br, ph);
        }
        System.out.println();
        System.out.println("Student Details");
        for (i = 0; i < n; i++)
            s[i].display();
    }
}


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class Customer {
    String temp;
    String dd, mm, yyyy;

    public void rd(String n, String d) {
        StringTokenizer token = new StringTokenizer(d, "/");
        dd = token.nextToken();
        mm = token.nextToken();
        yyyy = token.nextToken();
        System.out.println(n + "\t" + dd + "," + mm + "," + yyyy);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = s.next();
        System.out.print("Enter DOB in dd/mm/yyyy format: ");
        String date = s.next();
        Customer c = new Customer();
        c.rd(name, date);
    }
}
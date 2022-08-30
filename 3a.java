import java.io.*;
import java.util.Scanner;
class Integer
{
public static void main(String args[])
{
int a, b, res;
Scanner in = new Scanner(System.in);
System.out.println("Enter two numbers ");
a = in.nextInt ( );
b = in.nextInt ( );
try
{
res=a/b;
System.out.println("Result= "+res);
}
catch(ArithmeticException e)
{
System.out.println("Exception: Divide by zero error "+e);
}
}
}

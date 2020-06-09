import java.util.Scanner;       //imports scanner class

public class Average            //A program to find out average value of entered 5 numbers
{
    public static void main(String Args[])
    {
        Scanner scanner = new Scanner(System.in);           //creating a object, to input a value
        System.out.print("Please enter a value of A: ");    //Prints a statement to instruct user
        int a = scanner.nextInt();                          //Assigns value to variable a
        System.out.print("Please enter a value of B: ");    //Prints a statement to instruct user
        int b = scanner.nextInt();                          //Assigns value to variable b
        System.out.print("Please enter a value of C: ");    //Prints a statement to instruct user
        int c = scanner.nextInt();                          //Assigns value to variable c
        System.out.print("Please enter a value of D: ");    //Prints a statement to instruct user
        int d = scanner.nextInt();                          //Assigns value to variable d
        System.out.print("Please enter a value of E: ");    //Prints a statement to instruct user
        int e = scanner.nextInt();                          //Assigns value to variable e
        int total = a+b+c+d+e;                              //Using + operator, for addition of all the variables, and to assigns that value to variable total
        System.out.println("Average of "+a+", "+ b+", " +c+", "+d+", "+e+" and is :" +(total/5));// Prints statement, with pulling values of different variables
    }
}

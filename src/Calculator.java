import java.util.Scanner;

public class Calculator         //a program for operations of calculator
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter a value of A: ");    //prints statements, to instruct user
        int a=scanner.nextInt();                            //Assigns value to variable a
        System.out.print("Please enter a value of B: ");    //prints statement, to instruct user
        int b=scanner.nextInt();                            //Assigns value to variable b
        int total;                                          //creating a variable, to store value after operation
        System.out.print("Please select an operation(from + or - or * or / or % ) for process..: ");    // prints statement, to instruct user
        char symbol=scanner.next().charAt(0);               //Assigns value to variable symbol

       if(symbol=='+')  //condition applied, if value of symbol is +
        {
            total=a+b;  // if condition is true, addition of a & b with + operator and store value to total
        }
        else if(symbol=='-') //nested if, condition:b, applied if value of symbol is -
        {
            total=a-b;  // if condition b is true, subtraction of a & b with - operator and store value to total
        }
        else if(symbol=='*') // nested if, condition:c, applied if value of symbol is *
       {
           total=a*b;   //if condition c is true, multiplication of a & b with 8 operator and store value to total
       }
        else
       {
           total=a/b;   //if all the conditions are false, division of a & b with / operator and store value to total
       }
        System.out.print("Final value of operation you selected: "+ total); //Prints statement with total
        scanner.close();
    }
}

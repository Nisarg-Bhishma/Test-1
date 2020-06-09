import java.util.Scanner;     //imports Scanner class

public class TurneryExample //This program is example for Turnery operator
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter a number: ");  // Lets you input a number
        int n1=scanner.nextInt(); // Stores value to variable n1
        System.out.print("Please enter a number: "); // Lets you input a number
        int n2=scanner.nextInt(); // Stores value to variable n2

        int even=(n1%2==0)?n1:n2;  //condition applied as condition n1 is even?, if true assign value of n1 to variable even, if not
        System.out.println("Even value from the entered number is: " +even); //Prints value of even
        scanner.close();
    }
}
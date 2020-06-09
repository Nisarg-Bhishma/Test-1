import java.util.Scanner; //imports Scanner class

public class NumberValue
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        System.out.println("Please enter any number"); //prints statements, to instruct user
        int n1=scanner.nextInt();               //variable n1 holds entered value

        if(n1>0)                        //condition:a applied if n1>0
        {
            System.out.println("It is a positive number."); //if condition:a is true, prints statements
        }
        else if(n1<0)
        {
            System.out.println("It is a negative number"); //If condition:a is false,and condition:b is true, prints statements
        }
        else
        {
            System.out.println("It is a zero."); //If condition is false, prints statements
        }
    }
}

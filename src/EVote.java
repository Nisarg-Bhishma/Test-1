import java.util.Scanner;

public class EVote
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter your Age: "); //prints statements, to instruct user
        int age=scanner.nextInt();      //variable age holds entered value

        if(age>=18)//condition applied, if value of age>=18
        {
            System.out.println(age+" is eligible age to vote."); //If condition is true, prints statements
        }
        else
        {
            System.out.println(age+" is not eligible to vote. "); //If condition is false, prints statements
        }
    }
}

import java.util.Scanner;

public class City
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter any alphabet : "); //prints statements, to instruct user
        char ch=scanner.next().charAt(0);

        if(ch=='a'||ch=='A')
        {
            System.out.println("Accident, MD");  //prints statements
        }
        else if(ch=='b'||ch=='B')
        {
            System.out.println("Bacon Level, AL"); //prints statements
        }
        else if(ch=='c'||ch=='C')
        {
            System.out.println("Cut and Shoot, TX"); //prints statements
        }
        else if(ch=='d'||ch=='D')
        {
            System.out.println("Deadhorse, AK"); //prints statements
        }
        else if(ch=='e'||ch=='E')
        {
            System.out.println("Embarrass, MN"); //prints statements
        }
        else if(ch=='f'||ch=='F')
        {
            System.out.println("Fluffy Landing, FL"); //prints statements
        }
        else
        {
            System.out.println("It is an invalid entry. Please try again..."); //prints statements
        }
    }
}
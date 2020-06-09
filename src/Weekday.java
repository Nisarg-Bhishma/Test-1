import java.util.Scanner; //imports Scanner class

public class Weekday
{
    public static void main(String args[])
    {
        System.out.println("Please enter a value from 0 to 6");
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        int day=scanner.nextInt();

        if (day==0)
        {
            System.out.println("Sunday, 1st day of the week"); //prints statements
        }
        else if (day==1)
        {
            System.out.println("Monday, 2st day of the week"); //prints statements
        }
        else if (day==2)
        {
            System.out.println("Tuesday, 3st day of the week"); //prints statements
        }
        else if (day==3)
        {
            System.out.println("Wednesday, 4st day of the week"); //prints statements
        }
        else if (day==4)
        {
            System.out.println("Thursday, 5st day of the week"); //prints statements
        }
        else if (day==5)
        {
            System.out.println("Friday, 6st day of the week"); //prints statements
        }
        else
        {
            System.out.println("Saturday, 7st day of the week"); //prints statements
        }
    }
}

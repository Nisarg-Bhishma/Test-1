import java.util.Scanner; //imports Scanner class

public class Leapyear
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter a year, to find out if it's a leap year"); //prints statements, to instruct user
        int year = scanner.nextInt(); //variable year holds entered value of year
        if (year%4==0)//condition applied, if entered year is modulus of 4
        {
            System.out.println(year+" is a leap year"); //if condition is true, prints statements
        }
        else
        {
            System.out.println(year+" is not a leap year"); //if condition is false, prints statements
        }
    }
}

import java.util.Scanner; //imports Scanner class

public class PrintType
{
    public static void main(String Args[])
    {
        Scanner scanner = new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter anything: "); //prints statements, to instruct user
        char ch = scanner.next().charAt(0);

        if (ch>='0' && ch<='9')
        {
            System.out.println("You have entered a number."); //prints statements
        }
        else if(ch>='a' && ch<='z' || ch>='A'&&ch<='Z')
        {
            System.out.println("You have entered an alphabet."); //prints statements
        }
        else
        {
            System.out.println("You have entered a symbol"); //prints statements
        }
        scanner.close();
    }
}
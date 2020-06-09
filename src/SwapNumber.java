import java.util.Scanner; //imports Scanner class

public class SwapNumber
{
    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter a value of A: "); //prints statements, to instruct user
        int a = scanner.nextInt();                          //will hold entered value of a
        System.out.print("Please enter a value of B: "); //prints statements, to instruct user
        int b = scanner.nextInt();                      //will hold entered value of b
        int swap = a;   //variable swap will hold value of a
        a=b;            //new value of a will be replaced with value of b
        b=swap;         // new value of b will be replaced with value of swap

        System.out.println("New value of A: "+a); //prints statements with new value of a
        System.out.println("New value of B: "+b); //prints statements with new value of b
    }
}
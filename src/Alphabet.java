import java.util.Scanner;  //imports Scanner class

public class Alphabet      //A program to find out if entered character is Vowel or Consonant
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in);             //creating a object, to input a value
        System.out.print("Please enter any Alphabet: ");    // Prints the statement to give instruction
        char ch=scanner.next().charAt(0);                   // Lets you input a character of user choice
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') //Condition applied to find out if entered character is vowel
        {
            System.out.println("This is a Vowel letter"); //Prints statement if condition is true
        }
        else
        {
            System.out.println("This is a Consonant letter"); // Prints statement if condition is false
        }
        scanner.close(); //closing scanner class
    }
}

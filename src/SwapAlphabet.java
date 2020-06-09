import java.util.Scanner; //imports Scanner class

public class SwapAlphabet
{
    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter any alphabet : "); //prints statements, to instruct user
        char ch=scanner.next().charAt(0);
        int ascii = ch;
        if((ascii>64) && (ascii<91)) //Condition applied, if char ascii value is for Capital character
        {
            ascii=ascii+32;         //if condition is true, then variable ch will change its value accordingly(+32 in this case) for result
            ch= (char) ascii;
            System.out.println("After swapping : "+ch); //prints statements with new value of ch
        }
        else if((ascii>96) && (ascii<123))
        {
            ascii=ascii-32;         //if condition is false, then variable ch will change its value accordingly(-32 in this case) for result
            ch= (char) ascii;
            System.out.println("After swapping : "+ch); //prints statements with new value of ch
        }
    }
}
import java.util.Scanner; //imports Scanner class

public class Result
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter student name : "); //prints statements, to instruct user
        String name=scanner.nextLine(); //variable name holds entered value of name
        System.out.print("Please enter student roll number : "); //prints statements, to instruct user
        int id=scanner.nextInt(); //variable id holds entered value of id
        System.out.print("Please enter marks of English: "); //prints statements, to instruct user
        int m1=scanner.nextInt(); //variable m1 holds entered value of m1
        System.out.print("Please enter marks of Math : "); //prints statements, to instruct user
        int m2=scanner.nextInt(); //variable m2 holds entered value of m2
        System.out.print("Please enter marks of Science : "); //prints statements, to instruct user
        int m3=scanner.nextInt();    //variable m3 holds entered value of m3
        scanner.close();
        if (m1<35 ) //condition applied, if value of m1<35
        {
            System.out.println(name+ " has Failed in English."); //prints statements
        }
        if (m2<35 ) //condition applied, if value of m2<35
        {
            System.out.println(name+ " has Failed in Math."); //prints statements
        }
        if (m3<35) //condition applied, if value of m3<35
        {
            System.out.println(name+ " has Failed in Science."); //prints statements
        }
        if ((m1>=35)&&(m2>=35)&&(m3>=35))
        {
            System.out.println(name+" has passed in all subjects."); //prints statements
        }
    }
}
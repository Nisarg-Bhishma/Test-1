import java.util.Scanner; //imports Scanner class

public class Paystub
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter Employee name: "); //prints statements, to instruct user
        String name=scanner.nextLine();         //variable name holds entered value
        System.out.print("Please enter employee ID: "); //prints statements, to instruct user
        int id= scanner.nextInt();              //variable id holds entered value
        System.out.print("Please enter basic salary: "); //prints statements, to instruct user
        int salary= scanner.nextInt();             //variable salary holds entered value

        int hra= (salary*10)/100;          //variable hra, will hold value after applied operations
        int da=(salary*8)/100;              //variable da, will hold value after applied operations
        int ta=(salary*9)/100;              //variable ta, will hold value after applied operations
        int pf=(salary*20)/100;             //variable pf, will hold value after applied operations

        int gross= (salary+hra+da+ta-pf);      //variable gross, will hold value after applied operations

        System.out.println("Employee Name   : " +name); //prints statements, with value of name
        System.out.println("Employee ID     : "+id); //prints statements, with value of id
        System.out.println("Basic Salary    : "+salary); //prints statements, with value of salary
        System.out.println("------------------------"); //prints statement with lines
        System.out.println("HRA             : "+hra); //prints statements, with value of hra
        System.out.println("DA              : "+da); //prints statements, with value of da
        System.out.println("TA              : "+ta); //prints statements, with value of ta
        System.out.println("PF              : "+pf); //prints statements, with value of pf
        System.out.println("========================"); //prints statements with lines
        System.out.println("Gross Salary    : "+gross); //prints statements , with value of gross
    }
}

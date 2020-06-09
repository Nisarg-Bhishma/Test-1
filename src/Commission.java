import java.util.Scanner;

public class Commission
{
    public static void main(String Args[])
    {
        Scanner scanner=new Scanner(System.in); //creating a object, to input a value
        System.out.print("Please enter Sales ID: "); //prints statements, to instruct user
        int id=scanner.nextInt();
        System.out.print("Please enter Seller ID: "); //prints statements, to instruct user
        int seller=scanner.nextInt();
        System.out.print("Please enter Sales Amount: "); //prints statements, to instruct user
        int amount=scanner.nextInt();
        System.out.print("Please enter Base Salary: "); //prints statements, to instruct user
        int base=scanner.nextInt();
        int commission=0;
        if(amount>=50000)
        {   //commission should be 35%
           commission=(amount*35)/100;
        }
        else if(amount>=30000)
        {   //commission should be 20%
            commission=(amount*20)/100;
        }
        else if(amount>=20000)
        {   //commission should be 10%
            commission=(amount*10)/100;
        }
        else if(amount>=10000)
        {   //commission should be 5%
            commission=(amount*5)/100;
        }
        else
        {   //commission should be 2%
            commission=(amount*2)/100;
        }
       // System.out.println("Total Earned commission on this sale" +commission);
        int salary=base+commission;
        System.out.println("Sales ID            : " +id); //prints statements
        System.out.println("Seller ID           : " +seller); //prints statements
        System.out.println("Basic Salary        : " +base); //prints statements
        System.out.println("Sales Amount        : " +amount); //prints statements
        System.out.println("Commission for sale : "+commission); //prints statements
        System.out.println("================================="); //prints statements
        System.out.println("Total Salary        : " +salary); //prints statements
    }
}
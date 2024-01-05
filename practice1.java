//write a program to accept selling price and cost price from the user and display the profit.
import java.util.*;
public class Profit {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//accept selling price and cost price
System.out.println("Enter the selling price");
int sp=sc.nextInt();
System.out.println("Enter the cost price");
int cp=sc.nextInt();
int profit=sp-cp;
//display the profit
System.out.println("The profit is"+profit);
}
}

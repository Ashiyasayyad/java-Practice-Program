//write a program to accpet radius from the user and calculate area of circle and circumfrance of circle.
import java.util.Scanner;
public class Demo1{
public static void main(String args[])
{
double pi=3.14;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius");
//Accpet the radius
int r=sc.nextInt();
double area=pi*r*r;
//Display area of circle.
System.out.println("Area of circle is:"+area);

 double circle=2*pi*r*r;
//display circumference
System.out.println("Circumference of circle is:"+circle);
}
}


//WAP to accept basic details from the user and display the output
import java.util.Scanner;
public class Test1 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
//accpet details
System.out.println("Enter your name");
String name=sc.nextLine();

System.out.println("Enter your age");
int age=sc.nextInt();

System.out.println("Enter your address");
String adr=sc.nextLine();
//Display details
System.out.println("Name"+name+"\nAge"+age+"\naddress"+adr);
}
}
output-
Enter your name
abc
Enter your age
20
Enter your address
ashiya
Age20
address
parner


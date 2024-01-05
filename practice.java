//write a program to accpet 2 no from the user and perform arithmetic operation.
public class practice{
public static void main(String args[])
{
int num1,num2,res;
Scanner sc=new Scanner(System.in);
System.out.println("enter two number");
num1=sc.nextInt();
num2=sc.nextInt();
res=num1+num2;
System.out.println("Add is="+res);
res=num1-num2;
System.out.println("sub is="+res);
res=num1*num2;
System.out.println("mult is="+res);
res=num1/num2;
System.out.println("div is="+res);
}
}






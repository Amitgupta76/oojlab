import java.util.Scanner;
import java.lang.Math;
class bank
{
String name;
int acc_no;
float ba1,si;
void accept()
{
Scanner in=new Scanner(System.in);
System.out.println();
System.out.println("Enter the name of the account holder: ");
name = in.nextLine();
System.out.println("Enter the account number: ");
acc_no=in.nextInt();
System.out.println("Enter account balance: ");
ba1=in.nextFloat();
}
void display()
{
System.out.println();
System.out.println("Details: ");
System.out.println("\nname: "+name+"\naccount number: "+acc_no+"\nbalance: "+ba1);
}
void deposit()
{
System.out.println();
Scanner in=new Scanner(System.in);
System.out.println("\nDo you want to deposit(1 for yes 2 for no): ");
int d=in.nextInt();
if(d==1)
{
System.out.println("Enter the amount to be deposited: ");
int amt=in.nextInt();
ba1=ba1+amt;
System.out.println("Available balance= ");
}}}

class savings extends bank
{
void cheque()
{
System.out.println("\nno cheque service ");
}
void simple_interest()
{
System.out.println();
Scanner in=new Scanner(System.in);
System.out.println("\nEnter rate of interest: ");
int r=in.nextInt();
System.out.println("\nEnter the number of times interest applied per time period: ");
int n=in.nextInt();
System.out.println("Enter the time elapse: ");
int t=in.nextInt();
si=ba1*(1+r/n);
System.out.println("Simple interest=Rs "+(Math.pow(si,n*t)));
}
void withdrawal()
{
float amount;
Scanner in=new Scanner(System.in);
System.out.println("\nno minimum balance required");
System.out.println("\nenter the amount to be withdrawn");
amount=in.nextFloat();
if(amount>ba1)
System.out.println("\nbalance insufficient");
else
{
ba1=ba1-amount;
System.out.println("\n" +amount+"withdrawn");
System.out.println("\navailable balance"+ba1);
}}}

class current extends bank{
float service_charge=100;
void cheque()
{
System.out.println("\ncheque service available");
}
void withdrawal()
{
float amount;
Scanner in=new Scanner(System.in);
System.out.println("\nno minimum balance= Rs 1000");
System.out.println("\nenter the amount to be withdrawn");
amount=in.nextFloat();
if(amount>ba1)
System.out.println("\nbalance insufficient");
else
{
ba1=ba1-amount;
if(ba1<1000)
{
ba1=ba1-service_charge;
System.out.println("\nService charge of Rs"+service_charge+"is added");
System.out.println("\navailable balance"+ba1);
}
else
{
System.out.println("\n" +amount+"withdrawn");
System.out.println("\navailable balance"+ba1);
}
}}
}
public class banking 
{
public static void main(String args[])
{
savings obj1=new savings();
current obj2=new current();
System.out.println("\n1-savings \n2-current");
System.out.println("\n enter your choice");
Scanner in=new Scanner(System.in);
int ch=in.nextInt();
switch(ch)
{
case 1:
obj1 =new savings();
obj1.accept();
obj1.display();
obj1.cheque();
obj1.deposit();
obj1.simple_interest();
obj1.withdrawal();
break;
case 2:
obj2 =new current();
obj2.accept();
obj2.display();
obj2.cheque();
obj2.deposit();
obj2.withdrawal();
break;
default:
System.out.println("Invalid input");
break;
}}}










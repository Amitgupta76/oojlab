import java.util.*;
class Student
{
private String name,usn;
private int n;
private int credits[];
private int tc=0;
private double marks[];
private double sgpa=0;
Scanner in =new Scanner(System.in);
void accept()
{
System.out.println("enter the name and usn");
name=in.next();
usn=in.next();
System.out.println("Enter no of subjects");
n=in.nextInt();
credits=new int[n];
marks=new double[n];
for(int i=0;i<n;i++)
{
System.out.println("enter the credits of i st subject"+(i+1));
credits[i]=in.nextInt();
System.out.print("enter the marks of i st subject"+(i+1));
marks[i]=in.nextInt();
Calculate(credits[i],marks[i],i);
}
}
void Calculate(int credit,double mark,int j)
{
tc=tc+credit;
if(mark>89 && mark<101)
sgpa=sgpa+(10*credit);
else if(mark>79 && mark<90)
sgpa=sgpa+(9*credit);
else if(mark>69 && mark<80)
sgpa=sgpa+(8*credit);
else if(mark>59 && mark<70)
sgpa=sgpa+(7*credit);
else if(mark>49 && mark<60)
sgpa=sgpa+(6*credit);
else if(mark>39 && mark<50)
sgpa=sgpa+(5*credit);
else
System.out.println("fail");
}
void display()
{
System.out.println("Details of the student");
System.out.println("name="+name);
System.out.println("usn="+usn);
System.out.println("sgpa="+sgpa/tc);
}}
class sgpa
{
public static void main(String args[])
{
 Student s1 = new Student();
 s1.accept();
 s1.display();
}}




  
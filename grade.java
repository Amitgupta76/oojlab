import java.util.*;
class grade
{
public static void main(String args[])
{
int a,b;
float c;
Scanner in=new Scanner(System.in);
System.out.println("enter the cie marks");
a=in.nextInt();
System.out.println("enter the see marks");
b=in.nextInt();
c=(int)(a+b/2);
if(c>89 && c<101)
System.out.println("s grade");
else if(c>79 && c<90)
System.out.println("a grade");
else if(c>69 && c<80)
System.out.println("b grade");
else if(c>59 && c<70)
System.out.println("c grade");
else if(c>49 && c<60)
System.out.println("d grade");
else if(c>39 && c<50)
System.out.println("e grade");
else if(c>0 && c<40)
System.out.println("f grade");
}}



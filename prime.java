import java.util.*;
class prime
{
public static void main(String args[])
{
int a,b,i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter the 1st number");
a=in.nextInt();
System.out.println("enter the 2nd number");
b=in.nextInt();
for(i=a;i<=b;i++)
{
int c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==2)
System.out.println(i);
}}}
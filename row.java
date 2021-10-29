import java.util.*;
class row
{
public static void main(String args[])
{
int n,i,j,a=1;
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
n=in.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(a);
a++;
}
System.out.println();
}
}
}
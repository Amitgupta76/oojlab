import java.lang.*;
import java.util.*;
class area
{
public static void main(String args[])
{
double r,h,a,v;
int c;
while(3>2)
{
System.out.println("the choices are");
System.out.println("1-cylinder");
System.out.println("2-cone");
System.out.println("3-sphere");
System.out.println("4-exit");
Scanner in=new Scanner(System.in);
System.out.println("enter the choice");
c=in.nextInt();
switch(c)
{
case 1:
{System.out.println("enter the radius");
r=in.nextDouble();
System.out.println("enter the height");
h=in.nextDouble();
a=(2*3.14*r*h) + (2*3.14*r*r);
v=3.14*r*r*h;
System.out.println("area="+a);
System.out.println("volume="+v);}
break;
case 2:
{System.out.println("enter the radius");
r=in.nextDouble();
System.out.println("enter the height");
h=in.nextDouble();
a=3.14*r*(r+Math.sqrt(h*h+r*r));
v=(3.14*r*r*h)/3;
System.out.println("area="+a);
System.out.println("volume="+v);}
break;
case 3:
{System.out.println("enter the radius");
r=in.nextDouble();
System.out.println("enter the height");
h=in.nextDouble();
a=4*3.14*r*r;
v=(4/3)*3.14*r*r;
System.out.println("area="+a);
System.out.println("volume="+v);}
break;
case 4:
System.exit(4);
}}}}






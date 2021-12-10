import java.util.Scanner;
abstract class shape
{
double a,b;
abstract void printArea();
}

class rectangle extends shape
{
void getdata(double x,double y)
{
a=x;
b=y;
}
void printArea()
{
System.out.println("Area of rectangle="+(a*b));
}
}

class triangle extends shape
{
void getdata(double x,double y)
{
a=x;
b=y;
}
void printArea()
{
double area=0.5*a*b;
System.out.println("Area of triangle="+area);
}
}

class circle extends shape
{
void getdata(double x)
{
a=x;
}
void printArea()
{
double area=3.14*a*a;
System.out.println("Area of circle="+area);
}
}

public class area
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int ch;
shape si;
rectangle r1=new rectangle();
triangle r2=new triangle();
circle r3=new circle();
System.out.println("\n1-rectangle \n2-triangle \n3-circle \nenter the choice: \n");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("\nEnter the length and breadth: ");
double l=in.nextDouble();
double b=in.nextDouble();
r1.getdata(l,b);
r1.printArea();
break;
case 2:
System.out.println("\nEnter the base and heigth: ");
double b1=in.nextDouble();
double h=in.nextDouble();
r2.getdata(b1,h);
r2.printArea();
break;
case 3:
System.out.println("\nEnter the radius: ");
double r4=in.nextDouble();
r3.getdata(r4);
r3.printArea();
break;
default:
System.out.println("invalid");
}
}
}

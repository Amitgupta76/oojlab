import java.util.Scanner;
class Book
{
String name,author;
int price,num_pages;
Book()
{}
Book(String name,String author,int price,int num_pages)
{
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the name of the book");
name=s.next();
System.out.println("Enter the author of the book");
author=s.next();
System.out.println("Enter the price of the book");
price=s.nextInt();
System.out.println("Enter the number of paages of the book");
num_pages=s.nextInt();
}
public String toString()
{
return ("\nName: "+name+ "\nAuthor: " +author+ "\nPrice: " +price+ "\nNumber of pages" +num_pages);
}
}
class author
{
public static void main(String ss[])
{
Scanner a=new Scanner(System.in);
Book b1=new Book("heights","anne",299,345);
System.out.println("Constructor values:\n"+b1);
System.out.println("Enter the number of books");
int n=a.nextInt();
Book b[]=new Book[n];
for(int i=0;i<n;i++)
{
b[i]=new Book();
System.out.println("Enter the details of"+(i+1)+ "book");
b[i].accept();
}
for(int i=0;i<n;i++)
{
System.out.println("Details of book" + (i+1));
System.out.println(b[i]);
}}}


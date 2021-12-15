import java.util.*; 
import java.lang.Math;
class roots
{

  
public static void main(String[] args) 
{

 
double a,b,c;

Scanner in=new Scanner(System.in);
System.out.println("Enter the value of a");
a=in.nextDouble();    
System.out.println("Enter the value of b");
b=in.nextDouble();    
System.out.println("Enter the value of c");
c=in.nextDouble();    
double root1, root2;

  
    
double determinant = b * b - 4 * a * c;

    
if (determinant > 0) 
{

      
root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      
root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      
System.out.println("root1="+ root1);
    
System.out.println("root2="+ root2);
    
}

    
else if (determinant == 0) 
{

      
root1 = -b / (2 * a);
      
System.out.println("root1 & root2 are equal="+root1);
    
}

else 
{

     
System.out.println("There are no real solutions");
      
}
  
}
}

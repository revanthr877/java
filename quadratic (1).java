import java.util.*;
import java.lang.Math;
class quadratic
{
public static void main(String args[])
{
int a , b, c; double d , r1, r2 ,r;
System.out.println("enter the values of a , b, c");
Scanner s = new Scanner(System.in);
a = s.nextInt();
b = s.nextInt();
c = s.nextInt();
d = (b*b)-(4*a*c);
if(d<0)
{ d = Math.sqrt(-d)/(2*a);
  r = -b/(2*a);
System.out.println("root 1 = "+r+"+i"+d);
System.out.println("root 2 = "+r+"-i"+d);
}
else if (d>0)
{
r1 = (-b + Math.sqrt(d))/(2*a);
r2 = (-b - Math.sqrt(d))/(2*a);
System.out.println("root 1 = "+r1);
System.out.println("root 2 = "+r2);
}
else
{
r1 = -b /(2*a);
System.out.println("the roots are equal and the root is "+r1);
}

}
}
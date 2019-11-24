import java.util.*;
import java.lang.Math.*;
import CIE.*;
import SEE.*;
class stdinfo
{
 
 public static void main(String args[])
 {
  int x[]=new int[5];
  int y[]=new int[5];
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of students info u want");
  int n=s.nextInt();
  int sumi[]=new int[n];
  int sume[]=new int[n];
  double sum[]=new double[n];
  student ob[]=new student[n];
  internals oi[]=new internals[n];
  externals oe[]=new externals[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter USN,Name and Semester of the student"+(i+1));
   String a=s.next();
   String b=s.next();
   int c=s.nextInt();
   ob[i]=new student();
   ob[i].student1(a,b,c);
  }
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter the marks of the student"+(i+1)+" in the internals");
   for(int j=0;j<5;j++)
    x[i]=s.nextInt();
   oi[i]=new internals();
   sumi[i]=oi[i].internals1(x);
  }
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter the marks of the student"+(i+1)+" in the externals");
   for(int j=0;j<5;j++)
    y[i]=s.nextInt();
   oe[i]=new externals();
   sume[i]=oe[i].externals1(y);
  }
  for(int j=0;j<n;j++)
    sum[j]=sumi[j]+sume[j];

 System.out.println("PRINTING THE INFO OF ALL THE STUDENTS");
 for(int i=0;i<n;i++)
 { 
   sum[i]=sum[i]/2;
   System.out.println("STUDENT"+(i+1)+" : ");
   System.out.println("USN : "+ob[i].usn+"\nNAME : "+ob[i].name+"\nSEMISTER : "+ob[i].sem+"\nAVERAGE FINAL MARKS : "+sum[i]+"\n\n");
 }
}
}
 
 


   
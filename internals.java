package CIE;

public class internals
{
 public int marki[]=new int[5];
 public int sum=0;
 public int internals1(int a[])
 {
  for(int i=0;i<5;i++)
  {
   marki[i]=a[i];
   sum=sum+a[i];
  } 
  return sum;
 }
}


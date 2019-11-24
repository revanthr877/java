package SEE;
import CIE.*;


public class externals extends student
{
 public int marke[]=new int[5];
 public int sum=0;
 public int externals1(int a[])
 {
  for(int i=0;i<5;i++)
  {
   marke[i]=a[i];
   sum=sum+a[i];
  }
  return sum;
 }
}

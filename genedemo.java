import java.util.*;
class gene<N,T>
{N ob1;
T ob2;

public void disp(N a,T b)
{
this.ob1=a;
this.ob2=b;
System.out.println("name of the sent person is:"+ob1);
System.out.println("age of the sent person is:"+ob2);
}
}




class genedemo
{
public static void main(String args[])
{
gene<String,Integer>s1=new gene<String,Integer>();
gene<String,Integer>s2=new gene<String,Integer>();
s1.disp("nikhil",18);
s2.disp("revu",17);
}
}
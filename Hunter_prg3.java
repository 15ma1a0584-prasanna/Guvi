import java.io.*;
import java.util.*;
class Hunter_prg3
{
public static void main(String args[])
{
int n;
int v=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
if(n>=1&&n<=1000)
{
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]==i)
{
v=1;
System.out.print(a[i]+" ");
}
else
{
continue;
}
}
if(v==0)
{
System.out.println("-1");
}
}
}
}

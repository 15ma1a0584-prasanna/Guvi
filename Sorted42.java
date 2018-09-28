import java.io.*;
import java.util.*;
class Sorted42
{
    public static void main(String args[])
    {
        int n,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                flag=1;
                else
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.print("yes");
            
        }
        else
        {
            System.out.print("no");
        }
    }
}

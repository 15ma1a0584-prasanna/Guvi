import java.util.*;
import java.lang.*;
import java.io.*;

class Kth_SmallestNumber52
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(a[i]<a[j])
		        {
		            int t=a[i];
		            a[i]=a[j];
		            a[j]=t;
		        }
		    }
		}
		
		    System.out.println(a[k-1]);
	}
}

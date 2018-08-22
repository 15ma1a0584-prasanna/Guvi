
import java.util.*;
import java.lang.*;
import java.io.*;

class Prg106
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		if(a[k]%2!=0)
		System.out.println(a[k]);
		else
		System.out.println(a[k-1]);
	}
}

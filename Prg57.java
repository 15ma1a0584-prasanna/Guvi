

import java.util.*;
import java.lang.*;
import java.io.*;

class Prg57
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt(),k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(k==a[i])
			count++;
		}
		System.out.println(count);
	}
}

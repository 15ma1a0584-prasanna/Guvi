

import java.util.*;
import java.lang.*;
import java.io.*;

class SumOfNaturalno60
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=1,sum=0;
		int n=sc.nextInt();
		while(count<=n)
		{
			sum=sum+count;
			count++;
		}
		System.out.println(sum);
	}
}

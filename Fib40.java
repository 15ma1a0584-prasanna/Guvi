/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fib40
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int c;
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(b);
		for(int i=1;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}

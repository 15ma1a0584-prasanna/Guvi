/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,remainder=0;
		while(n!=0)
		{
			n=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		if(n==rev)
		System.out.println("Palindrom");
		else
		System.out.println("Not");
	
	}
}

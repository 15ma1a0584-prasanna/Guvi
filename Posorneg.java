/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Posorneg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0)
		System.out.println("zero");
		else if(a>0)
		System.out.println("Positive");
		else
		System.out.println("Negative");
	}
}

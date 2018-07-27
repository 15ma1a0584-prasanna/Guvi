/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Amstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n, sum = 0, temp, remainder, digits = 0;
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 temp = n;
		 while (temp != 0) 
		 {
		 	digits++;
		 	temp = temp/10;
		 	
		 }
		 temp = n;
		 while (temp != 0) 
		 {
		 	remainder = temp%10;
		 	sum = sum + power(remainder, digits);
		 	temp = temp/10;
		 	
		 }
		 if (n == sum)
		 System.out.println("yes");
		 else
		 System.out.println("no");
		
	}
	static int power(int n, int r)
	{
		int c, p = 1;
		for (c = 1; c <= r; c++) 
		p = p*n;
		return p;   
	}
}

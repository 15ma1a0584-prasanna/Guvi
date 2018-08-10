/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Swap37
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,temp;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1+" "+n2);
		
	}
}

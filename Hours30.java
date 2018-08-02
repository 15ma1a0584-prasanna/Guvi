/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hours30
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt(),m=sc.nextInt();
		int h1=sc.nextInt(),m1=sc.nextInt();
		System.out.println((Math.abs(h-h1))+""+(Math.abs(m-m1)));
		}
}

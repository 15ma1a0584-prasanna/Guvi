/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Count31
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int ch=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				ch++;
			}
		}
			System.out.println(ch);
		
	}
}

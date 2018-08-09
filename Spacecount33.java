/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Spacecount33
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,spaceCount=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		while(i<str.length())
		{
			if(str.charAt(i)==' ')
			{
				spaceCount++;
				
			}
			i++;
		}
		System.out.println(spaceCount);
		}
	}

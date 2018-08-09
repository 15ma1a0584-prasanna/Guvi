/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Countnumeric
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
				
			}
		}
		System.out.println(count);
	}
}

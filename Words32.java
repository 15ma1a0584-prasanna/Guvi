/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Words
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}



import java.util.*;
import java.lang.*;
import java.io.*;

class RemovingSpaces26
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc-new Scanner(System.in);
		String mytext = sc.nextLine();
		mytext = mytext.trim().replaceAll("[ ]{2,}", " ");
		System.out.println(mytext);
	}
}

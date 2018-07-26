/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Vowels
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		boolean isVowel=false;;
	Scanner scanner=new Scanner(System.in);
	
	char ch=scanner.next().charAt(0); 
	
	switch(ch)
	{
	   case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel = true;
	}
	if(isVowel == true) {
	   System.out.println("Vowel");
	}
	else {
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Consonant");
	   else
		System.out.println("Input is not an alphabet");	
	}
	}
	}

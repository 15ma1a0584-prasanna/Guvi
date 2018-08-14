
import java.util.*;
import java.lang.*;
import java.io.*;
class Prg73
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		if(n>l&&n<r)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}

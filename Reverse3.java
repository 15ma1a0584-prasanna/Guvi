import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int d,r=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println(r);
	}
}

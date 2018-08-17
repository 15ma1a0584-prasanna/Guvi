

import java.util.*;
import java.lang.*;
import java.io.*;
class Prg96
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int a=A,d=B,n=C;
		int res=(n*((2*a)+(n-1)*d))/2;
		System.out.println(res);
	}
}

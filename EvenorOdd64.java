import java.util.*;
import java.lang.*;
class EvenorOdd64
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k;
		k=n+m;
		if(k%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
	}
}

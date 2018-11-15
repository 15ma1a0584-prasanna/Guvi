import java.io.*;
import java.util.*;
class Balance31 {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i,flag=0,j;
		for(i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='(' )
		    {
		        flag+=1;
		    }
		    else if(s.charAt(i)==')')
		    {
                flag-=1;
		    }
		}
		if(flag==0)
		{

		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
	}
}

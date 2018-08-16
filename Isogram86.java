import java.util.*;
import java.lang.*;
import java.io.*;

class Isogram86
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		isIsogram(str);
	}
		static void isIsogram(String s)
		{
			String[] arg=s.split("");
			Set<String> mySet=new HashSet<String>(Arrays.asList(arg));
			if(s.length()==mySet.size())
			{
				System.out.println("Yes");
			}
					else
					{
						System.out.println("No");
					}
		}
		}

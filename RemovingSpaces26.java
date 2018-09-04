import java.util.*;
import java.lang.*;
import java.io.*;
class RemovingSpaces26
{
	public static void main (String[] args) throws java.lang.Exception
	{
			String text;
		Scanner sc=new Scanner(System.in);
		text=sc.nextLine();
if(text.indexOf("  ")>0){
 while(text.indexOf("  ") >= 0)
{
	
text = text.replaceAll("  "," ");
}
System.out.print(text);
}

else{
	text=text.replaceAll(" ","");
	System.out.print(text);
}
}
	
}

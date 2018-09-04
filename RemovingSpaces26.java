import java.util.*;
import java.lang.*;
import java.io.*;
class RemovingSpaces26
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        String str1 = "";
        for(int i = 0;i<str.length();i++)
        {
            if((c[i] == ' '&& c[i+1] != ' ') || (c[i] != ' '))
                str1 += c[i];
        }

        System.out.println(str1);
    }
}

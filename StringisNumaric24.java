

import java.util.*;
import java.lang.*;
import java.io.*;
class StringisNumaric24
{
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        String input = sc.next();
         
        try
        {
            
            Integer.parseInt(input);
            System.out.println("yes");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("no" );
        }
   
    }
}

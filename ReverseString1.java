import java.lang.*;
import java.io.*;
import java.util.*;
 
class ReverseString1
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	
        String input = sc.nextLine();
 
        StringBuilder input1 = new StringBuilder();

        input1.append(input);
 
        input1 = input1.reverse();
 
        System.out.println(input1);
    }
}

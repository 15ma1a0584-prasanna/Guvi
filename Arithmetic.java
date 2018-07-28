/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arithmetic{
     
    // Function to find sum of series.
    static int sumOfAP(int a, int d, 
                                  int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
     
    // Driver function
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(sumOfAP(a, d, n));
    }
}
 

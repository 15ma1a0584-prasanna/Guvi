import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class Lexico89
{
     public static void main(String aa[])
     {
        String s;
        Scanner ss=new Scanner(System.in);
        s=ss.next();
        char v[]=s.toCharArray();
        Arrays.sort(v);
        for(int i=0;i<v.length;i++)
        {
            System.out.print(v[i]);
        }
    }
    }

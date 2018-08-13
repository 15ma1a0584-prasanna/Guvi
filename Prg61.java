import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class Prg61
{
     public static void main(String aa[]){
     String d;
     int n;
     Scanner s=new Scanner(System.in);
     d=s.next();
     n=s.nextInt();
     char a[]=d.toCharArray();
     for(int i=0;i<n;i++){
        System.out.printf("%c",a[i]);
     }
}
}

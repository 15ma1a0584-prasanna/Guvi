import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class Binary62 {
     public static void main(String aa[]){
     String d;
     int n=1;;
     Scanner s=new Scanner(System.in);
     d=s.next();
     char a[]=d.toCharArray();
     for(int i=0;i<a.length;i++){
       if(a[i]!='0'&&a[i]!='1'){
           n=0;
           break;
       }
         }

       if(n==0){
          System.out.println("no");
       }
 else{
      System.out.println("yes");
 }
}
    }

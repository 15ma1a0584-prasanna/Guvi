import java.util.*;
import java.lang.*;
class Maximum{
      public static void main(String aa[]){
       int n;
       int count=0;
       int c;
       ArrayList<Integer>a=new ArrayList<Integer>();
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(int i=0;i<n;i++){
           c=s.nextInt();
           a.add(c);
       }
       System.out.println(Collections.max(a));
       
      
}
}

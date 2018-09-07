import java.util.*;
 class Diffs30
 {
    public static void main(String aa[]){
        String a,b;
        Scanner s=new Scanner(System.in);
        a=s.next();
        b=s.next();
        int kk=s.nextInt();
        StringBuffer xx=new StringBuffer(a);
        int m=xx.length();
        xx.insert(0, '[');
        xx.insert(m+1, ']');
        String c=xx.toString();
        String z=b.replaceAll(c, "");
        if(z.length()==kk){
            System.out.println("yes");
        }
 else{
            System.out.print("no");
 }
    }
}

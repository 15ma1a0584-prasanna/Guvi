import java.text.DecimalFormat;
import java.util.*;

class DecimalFormatExample {   
  
    public static void main(String args[])  {
    	Scanner sc=new Scanner(System.in);
    	float n1=sc.nextFloat();
    	float n2=sc.nextFloat();
    	float n3;
    	n3=n1*n2;
        DecimalFormat df = new DecimalFormat("##0.00000");
        System.out.println(df.format(n3));
    }
      
}

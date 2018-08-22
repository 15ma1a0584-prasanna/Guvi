
import java.util.Scanner;
 
class SquareDigit13 {
        public static void main (String[] args)
        {
            int no,m,s,sum=0;
            Scanner input = new Scanner(System.in);
             no = input.nextInt();
            while(no>0)
            {
                m=no%10;
                s = m*m;
                no=no/10;
                sum=sum+s;
            }
            System.out.println(sum);
        }
}

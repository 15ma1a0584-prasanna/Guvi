
import java.util.*;
class LCM88
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);

        int n1 , n2, lcm;
        n1=sc.nextInt();
        n2=sc.nextInt();

        lcm = (n1 > n2) ? n1 : n2;

        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }
    }
}
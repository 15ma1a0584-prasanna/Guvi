import java.util.*;
class PerfectSquareNumber79 {
public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number;
        int n=sc.nextInt();
        int k=sc.nextInt();
        number=n*k;

        int sqrt = (int) Math.sqrt(number);

        if(sqrt*sqrt == number) {

            System.out.println("yes");

        }else {

            System.out.println("no");

        }

         

    }

}

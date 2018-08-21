import java.util.*;
class Power104 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

        int base = sc.nextInt(), exponent = sc.nextInt();

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println(result);
    }
}

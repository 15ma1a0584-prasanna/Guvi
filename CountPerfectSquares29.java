import java.util.*;
class CountPerfectSquares29
{

    static int countSquares(int a, int b)
    {
        int cnt = 0; 

        for (int i = a; i <= b; i++)

            for (int j = 1; j * j <= i; j++)
                if (j * j == i)
                    cnt++;
        return cnt;
    }
}

class PerfectSquares {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        CountSquares obj = new CountSquares();
        System.out.print( obj.countSquares(a, b));
    }
}

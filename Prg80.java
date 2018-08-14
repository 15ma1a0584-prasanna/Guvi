import java.util.*;
class Prg80
{
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        while (input > 0) {
            if (input % 2 != 0) {
                System.out.print(input % 10+" ");
            }
            input = input / 10;
        }
    }
}

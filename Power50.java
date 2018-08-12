import java.util.*;
class Power50 {
  public static void main(String[] args)
  {

    Scanner sc=new Scanner(System.in);
    int number = sc.nextInt();

    if (isPowerOfTwo(number)) {
      System.out.println("yes");
    } else {
      System.out.printf("no");
    }
  }

  private static boolean isPowerOfTwo(int number) {

    if (number % 2 != 0) {
      return false;
    } else {

      for (int i = 0; i <= number; i++) {

        if (Math.pow(2, i) == number) return true;
      }
    }
    return false;
  }
}

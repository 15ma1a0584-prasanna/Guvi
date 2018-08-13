import java.util.*;
class Min63 { 
 
  public static void main(String args[])
  {
  	Scanner sc=new Scanner(System.in);
   int array[] = new int[10];
   for(int i=0;i<10;i++)
   {
   	array[i]=sc.nextInt();
   }
 
    int min = getMin(array);
    System.out.println(min);
  }
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}

import java.util.Scanner;

class KthNumber94 {

	public static void main(String[] args) {
		int N,K,i;
		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
	
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println(array[K-1]);

	}

}

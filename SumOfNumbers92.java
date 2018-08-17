import java.util.Scanner;

class SumOfNumbers92 {

	public static void main(String[] args) {
		int N,n,temp=0,i;
		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();
		for(i=0;i<N;i++)
		{
			n=sc.nextInt();
			temp=temp+n;
		}
		System.out.println(temp);

	}
}

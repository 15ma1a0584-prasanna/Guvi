import java.util.Scanner;

class SimpleInterest95 {

	public static void main(String[] args) {
		int P,T,R,s;
		Scanner sc=new Scanner(System.in);
		P=sc.nextInt();
		T=sc.nextInt();
		R=sc.nextInt();
		s=(P*T*R)/100;
		System.out.println(s);

	}

}

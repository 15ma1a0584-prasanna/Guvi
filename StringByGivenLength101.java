import java.util.Scanner;

class StringByGivenLength101
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=s.nextInt();
		System.out.println(str.substring(str.length()-n));
		s.close();
	}
}

import java.util.Scanner;
class strcom42 {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		String name1=ob.nextLine();
		String name2=ob.nextLine();
	if(name1.length()>name2.length())
	{
		System.out.println(name1);
	}
	else if(name1.contentEquals(name2))
	{
		System.out.println(name2);	
		
	}
	else if(name1.length()<name2.length())
	{
		System.out.println(name2);
	}

}
}

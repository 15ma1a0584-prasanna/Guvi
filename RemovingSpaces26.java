import java.util.*;
class RemovingSpaces26
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=str.trim().replaceAll(" +"," ");
		System.out.println(str1);
	}
}

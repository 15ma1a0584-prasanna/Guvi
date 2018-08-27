import java.util.*;
 class StringDifferenceByOneChar10 {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int dif=0;
		String str1=scan.next();
		String str2=scan.next();
		
		for(int loopVar=0;loopVar<str1.length();loopVar++) {
			if(str1.charAt(loopVar)==str2.charAt(loopVar)) {
				continue;
			}
			else {
				dif=dif+1;
			}
		}
		if(dif==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		scan.close();
	}
}

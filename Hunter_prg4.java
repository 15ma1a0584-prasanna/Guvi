import java.util.Scanner;

 class Hunter_prg4 
 {

	public static void main(String[] args) {
	
		int a[] = new int[25];
		int dup[] = new int[20];
		int snum=0,k=0; 
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		a[i] = sc.nextInt();
	}
	
		for(int i=1;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
		if(a[i-1]==a[j+i])
		{
		dup[k] = a[i-1];
		k++;
	 	}
		}
		}
		
		k=0;
		for(int j=0;j<n;j++)
		{
		k=0;
		for(int i=0;i<n/2;i++)
		{
		if(a[j]!=dup[i])
		{
		k = k+1;
		}
		if(k==(n/2))
		{
		snum = a[j];
		}
		}
		}
			

		System.out.println(snum);
}
}

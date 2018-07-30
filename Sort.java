import java.util.*;
class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]=new int[20];
   int n,i,j,temp;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(i=0;i<n;i++)
     {
    	a[i]=sc.nextInt();
     }
    for(i=0;i<n;i++)
    {
    	for(j=i;j<n;j++)
    		
    	{
    		if(a[i]>a[j])
    		{
    		    temp=a[j];
    			a[j]=a[i];
    			a[i]=temp;	
    		}
    	}
    }
   
    for(i=0;i<n;i++)
    {
    	System.out.println(a[i]);
    }
	}

}

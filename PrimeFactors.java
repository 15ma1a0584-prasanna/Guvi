import java.util.Scanner;

 class PrimeFactors
{    
    static void toprime(int num)
    {

    	int flag=1;int e=0;
        for(int i=2;i<=num;i++)
        {        	
        	double a=Math.sqrt(i); 
        	int temp = (int) Math.ceil(a);        	
        	A :for(int j=2;j<=temp;j++)
        	{
        		
        		if(i==2)
        		{
        			flag=1;        			
        			break A;        			
        		}
        		else if((i%j)==0)
        		{
        			flag =0;        			
        			break A;
        		}
        		
        		else
        		{
        			flag=1;          			
        		}
        	}
        	if(flag==1 && num%i==0)
        	{	
        		System.out.print(" "+i); 		 
        	}
        	
        }        
        
    }
    public static void main (String[] args) 
    {
    	
    	Scanner sn = new Scanner(System.in);
    	int n1 = sn.nextInt();
    
        toprime(n1);

    }
}

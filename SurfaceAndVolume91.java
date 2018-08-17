
import java.util.*;
import java.lang.*;
import java.io.*;

class SurfaceAndVolume91
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int surface;
		surface=2*l*b+2*l*h+2*b*h;
		int volume=l*b*h;
		System.out.println(surface+" "+volume);
	}
}

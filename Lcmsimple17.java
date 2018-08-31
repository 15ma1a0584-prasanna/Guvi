import java.util.*;
class Lcmsimple17
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int no1=in.nextInt(),no2=in.nextInt(),no;
        no=no1>no2?no1:no2;
        while(true)
        {
        if(no%no1==0&&no%no2==0)
        {
            System.out.println(no);break;
        }no++;
    }}
}

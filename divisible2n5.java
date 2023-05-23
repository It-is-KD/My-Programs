import java.util.*;
class divisible2n5
{
    public static void main()
    {
        System.out.println("Enter any Numbers");
        Scanner sc=new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        System.out.println("Enter Numbers");
        int inp=0;
        int ctr2=0;
        int ctr5=0;
        int i=0;
        for(i=1;i<=n;i++)
        {
        inp=sc.nextInt();
        if(inp%2==0)
        ctr2++;
        if (inp%5==0)
         ctr5++;
            }
        System.out.println("count of numbers divisible by 2 are :"+ctr2);
        System.out.println("count of numbers divisible by 5:"+ctr5);
    }
}

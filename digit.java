import java.util.*;
class digit
{
    public static void man()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int d=0;
        for(int i=n;i!=0;i/=10)
        {
            d=i%10;
            System.out.println(d);
        }
    }
}
        
import java.util.*;
class Prime_Number
{
    public static void NUMBER()
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            f++;
        }
        if(f==2)
        System.out.println(n+"is a Prime Number");
        else
        System.out.println(n+"is not a Prime Number");
    }
}

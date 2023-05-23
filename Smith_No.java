import java.util.*;
class Smith_No
{
    int Sum_Of_Digits(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    int Sum_Of_Prime(int n)
    {
        int i=2;
        int sum=0;
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+i;
                n=n/i;
            }
            else
            i++;
        }
        return sum;
    }
    public static void main()
    {
        Smith_No obj=new Smith_No();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting value:");
        int x=sc.nextInt();
        System.out.println("Enter a ending value:");
        int y=sc.nextInt();
        System.out.println("Smith no in series are:");
        for(int n=x;n<=y;n++)
        {
            int a=obj.Sum_Of_Digits(n);
            int b=obj.Sum_Of_Prime(n);
            if(a==b)
            System.out.println(n);
        }
    }
}
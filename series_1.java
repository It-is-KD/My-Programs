import java.util.*;
class display
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fibonacci series of 10 terms");
        System.out.println("Enter the sum of the digits");
        System.out.println("Enter your own choice");
        char ch=sc.nextInt();
        switch(ch)
        {
            case 1:int a=0,b=1,c=0;
            System.out.println(a);
            System.out.println(b);
            for(int i=3;i<=10;i++)
            {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
            break;
            case 2:System.out.println("Enter a number");
            int n=sc. nextInt();
            ints=0;int d;
            for(int i=n;i!=0;i/=10)
            {
                d=i%10;
                s=s+d;
            }
            System.out.println(s);
            break;
            default:System.out.println("incorrect");
        }
    }
}
                
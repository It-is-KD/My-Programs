import java.util.*;
class Fibonacci
{
    public static void series ()
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;int b=1;int c=0;
        System.out.println("Fibonacci Series");
        System.out.println(a+" "+b);
        while(c<n)
        {
        c=a+b;
        System.out.println(" "+ c);
        a=b;
        b=c;
    }
    }
}

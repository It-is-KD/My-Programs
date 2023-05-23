import java.util.*;
class display
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c;
        for(int i=0;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        {
            System.out.println("a prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
}
    
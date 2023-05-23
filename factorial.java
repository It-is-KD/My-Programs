import java.util.*;
class display
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a mumber");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++);
        {
            f*=i;
        }
        System.out.println("factorial of the number:"+f);
    }
}
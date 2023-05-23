import java.util.*;
class series5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit");
        int n=sc.nextInt();
    double f=1.0d;double t=0.0d;
   double s=0.0d;
    for(int i=2;i<=n;i++)
    {
        f=1.0d;t=0.0d;
    for(int j=1;j<=i;j++)
    {
        t=t+j;
        f=f*j;
        
    }
        s=s+t/f;
  }
    System.out.println(s);


}
}


import java.util.*;
class Integers
{
    public static void main()
    {
        System.out.println("Enter a number of 1 Digit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Numbers");
        int inp=0;
        int gr=0;
        int ls=0;
        int i=0;
        for(i=1;i<=n;i++)
        {
           inp=sc.nextInt();
           if(i==1&&inp>0)
           ls=inp;
           else if(inp<ls)
           ls=inp;
           else if(inp>gr)
            gr=inp;
        }
        System.out.println("The Least Number is :"+ls);
        System.out.println("The Greatest Number is :"+gr);
    }
}

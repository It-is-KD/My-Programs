/**Q. A program to disply any one number system 
      from four which are displayed in the menu
**/
import java.util.*;
class Number_System
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a number to be checked");
        int n=sc.nextInt();
        System.out.println("");
        System.out.println("Enter 1 to check if it is a prime no.");
        System.out.println("Enter 2 to check if it is a palindrom no.");
        System.out.println("Enter 3 to check if it is a armstrong no.");
        System.out.println("Enter 4 to check if it is a neon no.");
        int choice=sc.nextInt();
        int d=0;int s=0;int c=0;
        switch(choice)
        {
            case 1:
            {
                for(int i=0;i<=n;i++)
                {
                    if(n%i==0)
                     c++;
                }
                if(c==2)
                 System.out.println(n+" is a Prime no.");
                else
                 System.out.println(n+" is not a Prime no.");
            }
            break;
            case 2:
            {
                int r=1;
                for(int i=n;i!=0;i/=10)
                {
                    d=i%10;
                    r=r*(10+d);
                }
                if(r==n)
                 System.out.println(n+" is a Palindrom no.");
                else
                 System.out.println(n+" is not a Palindrom no.");
            }
            break;
            case 3:
            {
                for(int i=n;i!=0;i/=10)
                {
                    d=i%10;
                    c=(int)Math.pow(d,3);
                    s=s+c;
                }
                if(s==n)
                 System.out.println(n+" is an Armstrong no.");
                else
                 System.out.println(n+" is not an Armstrong no.");
            }
            break;
            case 4:
            {
                int sq=(int)Math.pow(n,2);
                for(int i=sq;i!=0;i/=10)
                {
                    d=i%10;
                    s+=d;
                }
                if(s==n)
                 System.out.println(n+" is a neon no.");
                else
                 System.out.println(n+" is not a neon no.");
            }
            break;
            default : System.out.println("Wrong Choice try again");
        }
    }
}

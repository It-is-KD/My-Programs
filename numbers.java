import java.util.*;
class numbers
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int inp=sc.nextInt();
       int q=0,r=0,ctr=0,rev=0;
       q=inp/10;
       r=inp%10;
       System.out.print(r);
       while(q!=0)
       {
                   
            r=q%10;
            q=q/10;
            System.out.print(r);
            ctr++;
            rev=rev+r*ctr;
            
       }
        System.out.print(rev);
    }
}
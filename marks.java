import java.util.*;
public class marks
{
    static int a[]=new int[10];
    static int b[]=new int[10];
    static int c[]=new int[10];
    static int r[]=new int[10];
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            int avg;
            System.out.println("enter the roll then subA marks subB marks subC marks");
            r[i]=sc.nextInt();
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            avg=(a[i]+b[i]+c[i])/3;
            if (avg>80)
            {
               System.out.println("roll:"+r[i]);
               System.out.println("average"+avg);
            }
            if (avg<40)
            {
                System.out.println("roll"+r[i]);
                System.out.println("average"+avg);
            }
        }
    }
}
            
            


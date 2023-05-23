import java.util.*;
class Linear_search
{
    public void Search(int [] ar,int item)
    {
        int i;int flag=0;int pos=0;
        int l=ar.length;
        int c=0;
        for(i=0;i<l;i++)
        {
            if(item==ar[i])
            {
                flag++;
                pos=i;
                c++;
                System.out.println("Position of item is "+(pos+1));
            }
        }
        if(flag==0)
        {
            System.out.println(" ");
            System.out.println("\n'"+item+"' is not found in the Array");
        }
        else
        {
            System.out.println(" ");
            System.out.println("\nFrequency of '"+item+"' is :"+c);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println(" ");
        System.out.println("Enter the Size of your Array");
        int n=sc.nextInt();
        int []a=new int[n];
        Linear_search obj=new Linear_search();
        int item=0,pos=0;
        System.out.println(" ");
        System.out.println("Enter "+n+" elements of your Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("Your Array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(" ");
        System.out.println("Enter the element to be Searched :");
        item=sc.nextInt();
        obj.Search(a,item);
    }
}
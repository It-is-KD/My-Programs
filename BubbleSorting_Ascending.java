import java.util.*;
class BubbleSorting_Ascending
{
    public void BSort()
    {
        int a[]=new int [10];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an array of 10 elements to be sorted");
        for(int i=0;i<10;i++)
        a[i]=sc.nextInt();
        int n=10;int t;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("The Array in Ascending order is :");
        for(int i=0;i<10;i++)
        System.out.println(a[i]);
    }
    public static void main()
    {
        BubbleSorting_Ascending obj=new BubbleSorting_Ascending();
        obj.BSort();
    }
}

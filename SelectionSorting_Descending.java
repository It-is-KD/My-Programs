import java.util.*;
class SelectionSorting_Descending
{
    public void SSort()
    {
        int a[]=new int [10];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an array of 10 elements to be sorted");
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        int n=10;int t;int max;int maxpos=0;
        for(int i=0;i<n-1;i++)
        {
            max=a[i];
            maxpos=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                    maxpos=j;
                }
            }
            t=a[i];
            a[i]=a[maxpos];
            a[maxpos]=t;
        }
        System.out.println("The Array in Descending order is :");
        for(int i=0;i<10;i++)
        System.out.println(a[i]);
    }
    public static void main()
    {
        SelectionSorting_Descending obj=new SelectionSorting_Descending();
        obj.SSort();
    }
}


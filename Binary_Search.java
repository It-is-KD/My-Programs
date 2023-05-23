import java.util.*;
class Binary_Search
{
    public void BSearch()
    {
        int a[]=new int [10];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an array of 10 elements in Ascending order");
        for(int i=0;i<10;i++)
        a[i]=sc.nextInt();
        int n=10;
        System.out.println("Enter an element to be searched");
        int ele=sc.nextInt();
        int s=0,e=n-1,m,f=-1;
        while(s<=e)
        {
            m=(s+e)/2;
            if(a[m]==ele)
            {
                f=m;
                break;
            }
            else if(a[m]>ele)
            e=m-1;
            else if(a[m]<ele)
            s=m+1;
        }
        if(f>=0)
        {
            System.out.println("Search successful");
            System.out.println("Element :"+a[f]);
            System.out.println("Position :"+(f+1));
        }
        else
        System.out.println("Search unsuccessful");
    }
    public static void main()
    {
        Binary_Search obj=new Binary_Search();
        obj.BSearch();
    }
}

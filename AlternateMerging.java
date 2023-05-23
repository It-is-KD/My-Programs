/**A Program to accept 2 Arrays of 'n' elements
each and merge them into a 3rd Array in such 
a way that alternative elements get copied into
the 3rd Array and Display it.
for eg-  Intput       Output
       |a | |b |       |c |
       |78| |61|       |78| 
       |42| |70|       |61|
       |39| |48|       |42|
                       |70|
                       |39|
                       |48|
 **/
import java.util.*;
class AlternateMerging
{
    public static void main()
    {   //start main method
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        int m=n+n;
        int[]a=new int[n];
        int[]b=new int[n];
        int[]c=new int[m];
        for(int i=0;i<n;i++)//loop to store the elements in array 'a'
        {
            System.out.println("Enter the "+(i+1)+"th element");
            a[i]=sc.nextInt();
        }
        System.out.println(" ");
        for(int i=0;i<n;i++)//loop to store the elements in array 'b'
        {
            System.out.println("Enter the "+(i+1)+"th element");
            b[i]=sc.nextInt();
        }
        System.out.println("The Arrays are");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
        System.out.println(" ");
        for(int i=0;i<n;i++)
            System.out.println(b[i]);
        System.out.println(" ");
        int k=0;
        for(int i=0;i<n;i++)//loop to merge the arays with alternate
        {                    //elements
            c[k++]=a[i];
            c[k++]=b[i];
        }
        System.out.println("The Resultant array is");
        for(int i=0;i<m;i++)
            System.out.println(c[i]);
    }   //end of main method
}       //end of class

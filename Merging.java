import java.util.*;
class Merging
 {
    public static void merging()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of array");
        int m=sc.nextInt();
        System.out.println("Enter the size of 2 array");
        int n=sc.nextInt();
        
        int[]a= new int[m];
        int[]b = new int[n];
        int[]c=new int[m+n];
        
        for(int i=0;i<m;i++) 
        {
            System.out.println("enter the " + i + "th elements");
            a[i]=sc.nextInt();
        }        
        for(int i=0;i<n;i++) 
        {
            System.out.println("enter the " + i + "th elements");
            b[i]=sc.nextInt();
        }        
        for(int i=0;i<m;i++) 
        {        
            c[i]=a[i];
        }
        
        for(int i=0;i<n;i++) 
        {
        
            c[i+m]=b[i];
            
        }
        System.out.println("Merged Array");    
        for(int i=0;i<(m+n);i++) 
        {
         System.out.println(c[i]);
        }
    }
}
       
    
    
 

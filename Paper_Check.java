import java.util.*;
class Paper_Check
{
    public void compute()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students in your class");
        int n=sc.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter the marks out of 100 in Computer Applications\naccording to their Roll. No.:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();                
        }
        System.out.println("Marks according to Roll. No. are :");
        for(int i=0;i<n;i++)
        System.out.println((i+1)+"."+" "+a[i]);
        System.out.println("");
        System.out.println("Students who passed this exam are :");
        for(int i=0;i<n;i++)
        {
            if(a[i]>=40&&a[i]<=100)
            {
                System.out.println((i+1)+"."+" "+a[i]);
            }
          }   
    }
    public static void main()
    {
        Paper_Check obj=new Paper_Check();
        obj.compute();
    }
}






/**Q. A program to input 5 roll numbers and their 
marks in 3 subjects,array with functions and 
display the roll no. with their marks and 
also if they passed or failed.
 **/
import java.util.*;
public class ArrayFunctions
{
    static int a[]=new int[5];
    static int b[]=new int[5];
    static int c[]=new int[5];
    static int r[]=new int[5];
    static double avg;
    public void input()//to input elements in the arrays
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the RollNo of 5 students");
        for (int i=0;i<5;i++)
            r[i]=sc.nextInt();
        System.out.println("Enter Computer marks of 5 students");
        for (int i=0;i<5;i++)    
            a[i]=sc.nextInt();
        System.out.println("Enter Biology marks of 5 students");
        for (int i=0;i<5;i++)
            b[i]=sc.nextInt();
        System.out.println("Enter Physics marks of 5 students");
        for (int i=0;i<5;i++)
            c[i]=sc.nextInt();
    }
    public void calculate()//to calculate
    {
        avg=0.0;
        for (int i=0;i<5;i++)
        {
            avg=(a[i]+b[i]+c[i])/3;
           
            if (avg>=40)
            {
                System.out.println("Roll No.\t:"+r[i]);
                System.out.println("Average \t"+avg+"  Remarks:Pass");
                            }
            System.out.println(" ");
            if (avg<40)
            {
                System.out.println("Roll No.\t:"+r[i]);
                System.out.println("Average \t"+avg+"  Remarks:Fail");
                            }
        }
    }
    public static void main()//to call the above methods
    {
        ArrayFunctions obj=new ArrayFunctions();
        obj.input();
        obj.calculate();
    }
}//end of class
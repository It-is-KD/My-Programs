/**A Program to print the following Pattern
  1
  21
  123
  4321
  12345
  654321
  .......
**/
import java.util.*;
class Nested_Loop_Pattern
{
    public static void main()
    {                                   //main methods starts
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the limit of the Pattern");
        int n=sc.nextInt();//to store the limit of the loop
        System.out.println(" ");
        System.out.println("The pattern with the limit "+n+" is :");
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);//printing the numbers
                }
            }
            else
            {
                for(int k=i;k>=1;k--)//a loop to reverse the numbers
                {
                    System.out.print(k);//printing the reversed numbers 
                }
            }
            System.out.println();
        }
    }                                   //end of main method 
}                                       //end of class

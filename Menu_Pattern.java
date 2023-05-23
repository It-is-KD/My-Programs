/**Q. a program to display a menu of patterns and 
display a pattern as per choice of the user 
 **/
import java.util.*;
class Menu_Pattern
{
    public static void main()
    {   //start of main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the pattern");
        int n=sc.nextInt();
        System.out.println(" ");
        System.out.println("Enter 1 for right angled triangle with only'*'");
        System.out.println("Enter 2 for right angled triangle");
        System.out.println("Enter 3 for right angled triangle with only 7 & 0");
        int choice=sc.nextInt();//variable to store the choice of the user
        switch(choice)
        {
            case 1:  //Right angled triangle with '*'
            {
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print('*');
                    }
                    System.out.println();
                }
            }
            break;
            case 2:  //laterlly inverted Right angled triangle
            {
                for(int i=1;i<=n;i++)
                {
                    for(int sp=1;sp<=(n-i);sp++)
                    {
                        System.out.print(' ');
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            break;
            case 3:  //Right angled triangle with 7&0 numbers
            {
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print((j%2)*7);
                    }
                    System.out.println();
                }
            }
            break;
            default : System.out.println("Wrong Choice Try Again");
        }//switch case closes
    }
}//end of class

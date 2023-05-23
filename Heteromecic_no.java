import java.util.*;
class Heteromecic_no
{//class begins here
    public static void main()
    {//main() method begins here
        Heteromecic_no obj=new Heteromecic_no();
        Scanner sc=new Scanner(System.in);

        System.out.println("How many numbers do you want to check ?");
        int n=sc.nextInt();
        int[] ar=new int[n];//array of size n being declared

        if(n==1)
        {
            System.out.println("Enter the number");
        }

        if(n>1)
        {
            System.out.println("Enter the "+n+" numbers");
        }
        System.out.println("");

        for(int i=0;i<n;i++)//values are being inputted
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("");
        int num;
        boolean check;
        for(int j=0;j<n;j++)
        {
            num=ar[j];
            check=obj.isHeteromecic_no(num);
            if(check==true)
            {
                System.out.println(num+" is a Heteromecic_no Number ");
            }
            else
            {
                System.out.println(num+" is not a Heteromecic_no Number ");

            }
            System.out.println("");
        }
    }//main() method ends here
    public boolean isHeteromecic_no(int num)
    {//isHeteromecic_no() method begins here
        
        int ans = 0;
        boolean check;
    
        for(int i=0; i<num; i++)
        {//for loop begins here
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
            else
            {
                continue;
            }
        }//for loop ends here
         
        if(ans == 1)
        {
            check=true;
        }
        else
        {
            check=false;
        }
        return check;
    }//isHeteromecic_no() method ends here
}//class neds here
          
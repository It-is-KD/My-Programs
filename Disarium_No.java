import java.util.*;
class Disarium_No
{//class begins here
    public static void main()
    {//main() method begins here
        Disarium_No obj=new Disarium_No();
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
            check=obj.isDisarium_No(num);
            if(check==true)
            {
                System.out.println(num+" is a Disarium_No Number ");
            }
            else
            {
                System.out.println(num+" is not a Disarium_No Number ");

            }
            System.out.println("");
        }
    }//main() method ends here
    public boolean isDisarium_No(int num)
    {//isDisarium_No() method begins here
        int copy = num, d = 0, sum = 0;//variables are declared
        String s = Integer.toString(num);  
        int len = s.length();  
        boolean check;
        while(copy>0)
        {//while loop begins here
            d = copy % 10;  
            sum = sum + (int)Math.pow(d,len);
            len--;
            copy = copy / 10;
        }//while loop ends here

        if(sum == num)
        {
            check=true;
        }
        else
        {
            check=false;
        }
        return check;
    }//isDisarium_No() method ends here

}//class ends here
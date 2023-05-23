import java.util.*;
class Mersenne_No
{//class begins here
    public static void main()
    {//main() method begins here
        Mersenne_No obj=new Mersenne_No();
        Scanner sc=new Scanner(System.in);

        System.out.println("How many numbers do you want to check ?");
        int n=sc.nextInt();
        int[] ar=new int[n];//array of size n being declared

        if(n==1)
            System.out.println("Enter the number");

        if(n>1)
            System.out.println("Enter the "+n+" numbers");
        System.out.println("");

        for(int i=0;i<n;i++)//values are being inputted
            ar[i]=sc.nextInt();
        System.out.println("");
        int num;
        boolean check;
        for(int j=0;j<n;j++)
        {
            num=ar[j];
            check=obj.isMersenne_No(num);
            if(check==true)
            {
                System.out.println(num+" is a Mersenne_No Number ");
            }
            else
            {
                System.out.println(num+" is not a Mersenne_No Number ");

            }
            System.out.println("");
        }
    }//main() method ends here

    public boolean isMersenne_No(int n)
    {//isMersenne_No() method begins here
        int copy=n;
        boolean check=false;
        int c=0;
        int pro;
        for(int i=1;i<=n;i++)
        {//for loop begins here
            if(n%i==0)
            {
                c++;
            }
        }//for loop ends here
        if(c==2)
        {//if statement begins hyere
            for(int j=1;j<n;j++)
            {
                pro=j*2+1;
                if(pro==n)
                {
                    check=true;
                    break;
                }
                else
                {
                    continue;
                }

            }
        }//is statement ends here
        else
        {//else statement begins here
            check=false;
        }//else statement ends here
        return check;
    }//isMersenne_No() meyhod ends here

}//class endss here

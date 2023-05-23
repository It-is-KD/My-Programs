import java.util.*;
class DigitPrinting
{//class begins here
    public static void main()
    {//main() method begins here
        
        DigitPrinting obj=new DigitPrinting();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");//a number is being entered
        int num=sc.nextInt();
        String[] ar={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};//array being declared
        int copy=num;
        int r;
        String word="";
        int rev=obj.Reverse(copy);
        System.out.println("");
        System.out.println("Number in words:");
        System.out.println("");
        while(rev!=0)
        {//while loop begins here
            r=rev%10;
            word=word+ar[r]+" ";
            rev=rev/10;
        }//while loop ends here
        
        System.out.println(word);
        
    }//main() method ends here
    int Reverse(int copy)
    {//Reverse() method begins here
        int rev=0,r;
        
        while(copy!=0)
        {//while loop begins here
            r=copy%10;
            copy=copy/10;
            rev=rev*10+r;
        }//while loop ends here
        
        return rev;//returning the reversed number
        
    }//Reverse() method ends here
}//class ends here    
import java.util.*;
class Transaction
{
    static int type,month;
    static double interest,balance,bal,deposit,details,withdraw,amt,newamt,profit,amount,fin;
    static long accountno;
    static String name;
    public Transaction()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter your name");
    name=sc.nextLine();
    System.out.println("Please enter your account number");
    accountno=sc.nextLong();
    System.out.println("          Welcome To Transaction          ");
    System.out.println("***************Please Wait****************");
    System.out.println("                                          ");
    System.out.println("Please enter your choice");
    System.out.println("For Savings account enter 1");
    System.out.println("For Recurring Deposite enter 2");
    System.out.println("For Fixed Deposite enter 3");
    System.out.println("******************************************");
    type=sc.nextInt();
}
   public double Deposit()
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your current balance");
   double depo=sc.nextDouble();
   int loop=0;
   while(loop<1)
   {
        System.out.println("*****************************************");
        System.out.println("Please to deposit an amount press 1");
        System.out.println("If you want to exit press 0");
        System.out.println("========================================");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        System.out.println("Enter the amount to be Deposited");
        newamt=sc.nextDouble();
        depo=depo+newamt;
        System.out.println("");
        System.out.println("Your Balance after depositing "+newamt+" is: "+depo);
        break;
        
        case 0:
        loop=5;
        break;
            
        default:System.out.println("You made a wrong choice please try again ");

            
     }
   }
   return depo;
}
   public double Savings()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your current Balance ");
    balance=sc.nextDouble();
    int loop=0;
    while(loop<1)
    {
        System.out.println("*****************************************");
        System.out.println("If you want to withdraw press 1");
        System.out.println("If you want to deposit press 2");
        System.out.println("If you want to exit press 0");
        System.out.println("========================================");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            System.out.println("Enter the amount to be Withdrawn");
            withdraw=sc.nextDouble();
            if(balance<withdraw)
            System.out.println("Sorry Transaction can't be made as "+withdraw+" is greter than your current balance");
            else
            {
            balance=balance-withdraw;
            System.out.println("Your Balance after withdrawing "+withdraw+" is:"+balance);
            }
            break;
            
            case 2:
            System.out.println("Enter the amount to be Deposited");
            newamt=sc.nextDouble();
            balance=balance+newamt;
            System.out.println("Your Balance after depositing "+newamt+" is:"+balance);
            break;
            
            case 0:
            loop=5;
            break;
            
            default:System.out.println("You made a wrong choice please try again ");

        }
    }
    return balance;
}
   public void Display()
   {
    System.out.println("");
    System.out.println("");
    System.out.println("========================================");
    System.out.println("              TRANSACTION               ");
    System.out.println("**************Please Wait***************");
    System.out.println("");
    System.out.println("");
    System.out.println("Name         :"+name);
    System.out.println("Account no.  : "+accountno);
    System.out.println("Balance : Rs."+balance);
    System.out.println("");
    System.out.println("");
    System.out.println("========================================");
}
public static void main()
   {
   Transaction obj=new Transaction();
   int h=0;
   switch(type)
   {
   case 1:
   bal=obj.Savings();
   obj.Display();
   h=5;
   break;

   case 2:
   balance=obj.Deposit();
   obj.Display();
   h=5;
   break;
   
   case 3:
   System.out.println("Sorry Service not available");
   System.out.println("Patience is Sweet");
   break;

   case 0:
   System.exit(0);
   break;

   default:System.out.println("Wrong deposit");
}
}
}
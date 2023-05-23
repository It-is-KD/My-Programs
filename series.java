import java.util.*;
class Series
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
System.out.println("niven number");
System.out.println("Enter the nth term of the series:1,3,6,10...");
int n2=sc.nextInt();
System.out.println("Enter your choice"); 
Char(ch)=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter a number");
int n=sc.nextInt();
int d,s=0;
for(int i=n;i!=0;i/=10)
{
    d=i%10;
    s=s+d;
}
if(n%s==0)
{
    System.out.println("a niven number");
}
else
{
    System.out.println("not a niven number");
}
break;
case2:inta=0;
for(int i=1;i<=n;i++)
{
    a+=i;
}
System.out.println("nth term of the series is="+a);
break;
default:System.out.println("wrong choice");
}
}
}
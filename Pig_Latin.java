import java.util.*;
class Pig_Latin
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        String w=s.toUpperCase();
        int l=w.length();
        char ch;int f=-1;String s1,s2,s3;
        for(int i=0;i<l;i++)
        {
            ch=w.charAt(i);
            if(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U')
            {
                f=i;
                break;
            }
        }
        if(f>=0)
        {
            s1=w.substring(f);
            s2=w.substring(0,f);
            s3=s1+s2+"AY";
            System.out.println(s3);
        }
        else
        System.out.println(w);
    }
}
import java.util.*;
class Longest
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        s=s+"";
        int l=s.length();
        char ch;
        int p=0;String w="",longest="";
        int max=0,m=0;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                w=s.substring(p,i);
                p=i+1;
                m=w.length();

                if(m>max)
                {
                    longest=w;
                }
            }
        }
        System.out.println("Longest Word :"+longest);
    }
}


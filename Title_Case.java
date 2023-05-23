/**Q. write a program to
 * accept string and display
 * it in title case
 * eg :
 * tHis IS an apPlE
 * op = This Is An Apple
 */
import java.util.*;
class Title_Case
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string");
        String n=sc.nextLine();
        String s=n.toLowerCase();
        int l=s.length();
        char ch=' ',ch1=' ';String w;
        String s1=" ";
        s=" "+s;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch==' ')
            {
                s1=s1+ch;
                s1=s1+(char)(ch1-32);
                i++;
            }
            else
             s1=s1+ch;
        }
        System.out.println(s1);
    }
}

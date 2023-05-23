import java.util.*;
class VowelsCheck
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s1=sc.nextLine();
        String s=s1.toLowerCase();
        System.out.println("String in lower case letters :"+s);
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println(ch+"\t");
            }
        }
    }
}
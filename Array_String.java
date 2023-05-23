import java.util.*;
class Array_String
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[20];
        char ch;
        for(int i=0;i<20;i++)
        {
            System.out.println("enter the name");
            a[i]=sc.nextLine();
        }
        String s=" ";
        System.out.println("The Names starting with vowels :");
        System.out.println(" ");
        for(int i=0;i<20;i++)
        {
            s=a[i];
            ch=s.charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')            
            System.out.println(a[i]);
        }
    }
}
        

/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Extraction
{
    public static void main()
    {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ch;
        int l =s.length();
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.println((i+1)+(i+4));
            }
        }
    }
}

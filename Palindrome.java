/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Palindrome
{
    public static void main()
    {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l = s.length(); 
        String s1= "  ";
        for(int i=1-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s.equalsIgnoreCase(s1)==true)
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not Palindrome");
        }
    }
}

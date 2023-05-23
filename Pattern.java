/**Q.Write a program to
 * print a pattern of string
 * given by the user
 * eg :
 * this
 * this is
 * this is an
 * this is an apple
 */
import java.util.*;
class Pattern
{
    public static void main()
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter the string");
      String s=sc.nextLine();
      int l=s.length();
      char ch=' ';
      s=s+" ";
      for(int i=0;i<l;i++)
      {
          ch=s.charAt(i);
          if(ch==' ')
          System.out.println(s.substring(0,i));
      }
    }
}
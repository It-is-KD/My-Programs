/**
 * Q. Write a program to
 * input a Sentence and 
 * print the characters in 
 * alphabetical order.
**/
import java.util.*;
class Alphabeticle_Order
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        char ch;String s1=" ";int b;
        int l=s.length();
        for(int a=65;a<=90;a++)
        {
            b=a+32;
            for(int i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch==(char)a||ch==(char)b)
                s1=s1+ch;
            }
        }
        System.out.println(s1);
    }
}
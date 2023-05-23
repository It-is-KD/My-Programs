import java.util.*;
public class Sample_one
{
    static int x;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        x =sc.nextInt();
    }
    public static void sampleMethod(int y)
    {
        Sample_one obj=new Sample_one();
        obj.input();
        System.out.println("Sum= "+(x + y));
    }
}

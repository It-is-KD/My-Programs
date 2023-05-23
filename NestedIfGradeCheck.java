/**Q. A program to give grade to those
who has scored as per follows
<=40 - F
<60 - D
>60 - C
>75 - B
>90 - A
(Using nested if)
 **/
import java.util.*;
class NestedIfGradeCheck
{
    public static void main()
    {   //start of class
        final int passMarks=40;
        char G;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        int marks=sc.nextInt();//to store the marks
        if(marks<=100)
        {
            if(marks>=passMarks)//to check the students who passed
            {
                if(marks>90)
                    G='A';
                else if(marks>75)
                    G='B';
                else if(marks>60)
                    G='C';
                else 
                    G='D';
                System.out.println("You Passed the Exam\nYour grade is : "+G);
            }
            else//to display the students who failed
            {
                G='F';
                System.out.println("Sorry you Failed the exam\nYour grade is : "+G);
            }
        }
        else
            System.out.println("The marks entered are wrong");
    }
}//end of class
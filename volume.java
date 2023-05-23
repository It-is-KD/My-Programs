/**Q. A Program to overload a function having 
a menu of any four items in the menu of 
your choice and also with an exit.
 **/
import java.util.*;
import java.lang.*;
class volume
{
    public static void main()
    {
        int loop=4;//loop variable
        Scanner sc=new Scanner(System.in);
        while(loop<5)
        {
            System.out.println("*****************************************");
            System.out.println("Enter 1 for volume of cube");
            System.out.println("Enter 2 for volume of cuboid");
            System.out.println("Enter 3 for volume of cylinder");
            System.out.println("Enter 4 for volume of sphere");
            System.out.println("Enter 5 to Exit");
            int choice=sc.nextInt();
            if (choice==5)
            {
                System.out.println("Exited!!!!");
                System.exit(0);//to exit the program
            }
            volume obj=new volume();//reating object
            switch(choice)
            {
                case 1://volume of cube
                {
                    System.out.println("Enter a side of the cube");
                    int s=sc.nextInt();
                    int vol_cube=obj.Volume(s);
                    System.out.println("the volume of cube is = "+vol_cube);
                    --loop;
                }
                break;

                case 2://volume of cuboid 
                {
                    System.out.println("Enter length of the cuboid");
                    int l=sc.nextInt();
                    System.out.println("Enter breath of the cuboid");
                    int b=sc.nextInt();
                    System.out.println("Enter the height of the cuboid");
                    int h=sc.nextInt();
                    int vol_cuboid=obj.Volume(l,b,h);
                    System.out.println("The volume of cuboid is = "+vol_cuboid);
                    --loop;
                }
                break;

                case 3://volume of cylinder
                {
                    System.out.println("Enter the radius of the cylinder");
                    double r=sc.nextDouble();
                    System.out.println("Enter the height of the cylinder");
                    double p=sc.nextInt();
                    double vol_cylinder=obj.Volume(r,p);
                    System.out.println("the volume of the cylinder is = "+vol_cylinder);
                    --loop;
                }
                break;

                case 4://volume of sphere
                {
                    System.out.println("Enter the radius of the sphere");
                    double x=sc.nextDouble();
                    double vol_sphere=obj.Volume(x);
                    System.out.println("The volume of the sphere is = "+vol_sphere);
                    --loop;
                }
                break;
               
                default :System.out.println("Exited!!!!");
                break;
            }//switch case closes 
        }//while loop closes
    }
    //Overloading The Function Below
    public int Volume(int a )
    {
        int volume=a*a*a;
        return volume;
    }

    public int Volume(int L,int B,int H)
    {
        int volume=L*B*H;
        return volume;
    }

    public double Volume(double P,double R)
    {
        double volume=3.14*R*R*P;
        return volume;
    }

    public double Volume(double X)
    {
        double volume=(4/3)*3.14*X*X*X;
        return volume;
    }
}//end of class
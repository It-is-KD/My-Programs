/**Q. Define a class TaxiMeter 
Data Members- taxino//to store the taxi 
number
String name//to store the name of the
Passenger
int km//to store the no of km traveled
int b//to store the taxi fair
Member Functions- taxi meter//constructor
input()// to accpt taxino,name,,km
calculate()//to calculate the bill as per
km travelled | Rate per km
<1       |     Rs 25
1-6      |     Rs 10
next 6   |     Rs 15
next 6   |     Rs 20
> 18     |     Rs 25
display()//to display as per 
Taxi Number   Name   Km Travelled   Amount
call the above in main method
 **/
import java.util.*;
class TaxiMeter
{
    int taxino;
    String name;
    int km;
    int b;
    TaxiMeter()//Constructor
    {
        taxino=0;
        name=" ";
        b=0;
    }

    public void input()//method to input variables
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Taxi number");
        taxino=sc.nextInt();
        System.out.println("Enter the name of the passenger");
        name=sc.next();
        System.out.println("Enter the km travelled ");
        km=sc.nextInt();
    }

    public void calculate()//method to calculate the bill
    {
        if(km<=1)
            b=25;
        else if(km>=1&&km<=6)
            b=(10*km)+25;
        else if(km<=12)
            b=25+(5*10)+(km-6)*15;
        else if(km<=18)
            b=25+(5*10)+(6*15)+(km-12)*20;
        else if(km>18)
            b=25+(5*10)+(6*15)+(6*20)+(km-18)*25;
    }

    public void display()//method to display bill
    {
        System.out.println("Taxi Number\tName\tKm Travelled\tAmount");
        System.out.println(taxino+"\t\t"+name+"\t"+km+"\t\t"+b);
    }

    public static void main()//main method to call above methods
    {
        TaxiMeter obj=new TaxiMeter();
        obj.input();
        obj.calculate();
        obj.display();
    }
}// end of class
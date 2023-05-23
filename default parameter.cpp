#include <bits/stdc++.h>
using namespace std;
 
int power(int , int);
 
int main ()
{
   int a = 10, choice=0;
   int b = 0, p=0;
   cout<<"1. Other than Squaring\n2. Square\n";
   cin>>choice;
   switch(choice)
   {
	   case 1:
		   cout<<"Enter the power: ";
		   cin>>b;
		   p = power(a, b);
		   break;
	   case 2:
		   p = power(a, b=2);
		   break;
   }
   cout<<"The power is = "<<p;
   return 0;
}

int power(int x, int y)
{
   int p = pow(x, y);
   return p;
}
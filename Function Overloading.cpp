#include <iostream>
using namespace std;
 
void swap(int &, int &);
void swap(int &, float &);
 
int main ()
{
   
   int a = 100;
   float b = 200.10;
 
   cout << "Before swap, value of a :" << a << endl;
   cout << "Before swap, value of b :" << b << endl;
 
   swap(a, b);
 
   cout << "After swap, value of a :" << a << endl;
   cout << "After swap, value of b :" << b << endl;
 
   return 0;
}

void swap(int &x, float &y)
{
   float temp;
   temp = x;
   x = y;    
   y = temp;
   return;
}

void swap(int &x, int &y)
{
   int temp;
   temp = x;
   x = y;    
   y = temp;
   return;
}
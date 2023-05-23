#include <bits/stdc++.h>
using namespace std;

inline void Sum(int, int);
inline void Difference(int, int);
inline void Multiplication(int, int);
inline void Division(int, int);

int main()
{
    int p, q;
    
    cout<<"Enter any two numbers:\n";
    cin>>p>>q;
    cout<<endl;
    
    Sum(p, q);
    Difference(p, q);
    Multiplication(p, q);
    Division(p, q);
    
    return 0;
}

inline void Sum(int p, int q)
{
    int sum = p + q;
    cout<<"SUM\t\t"<<p<<" + "<<q<<" = "<<sum<<"\n";
}

inline void Difference(int p, int q)

{
    int sub = p - q;
    cout<<"DIFFERENCE\t"<<p<<" - "<<q<<" = "<<sub<<"\n";
}

inline void Multiplication(int p, int q)
{
    int mul = p * q;
    cout<<"PRODUCT\t\t"<<p<<" * "<<q<<" = "<<mul<<"\n";
}

inline void Division(int p, int q)
{
    float div = (float)p / q;
    cout<<"QUOTIENT\t"<<p<<" / "<<q<<" = "<<div<<"\n";
}
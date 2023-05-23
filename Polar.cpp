#include <bits/stdc++.h>
using namespace std;

class Polar
{
	private:
	    double radius;
	    double angle;
	    
	public:
	    Polar()
		{
	        radius = 0.0;
	        angle = 0.0;
	    }
	
	    Polar(double r, double a)
		{
	        radius = r;
	        angle = a;
	    }
	
	    Polar(const Polar& other)
		{ 
	        radius = other.radius;
	        angle = other.angle;
	    }
	
	    ~Polar() {
	        cout << "Destructor called" <<endl;
	    }
	    
	    friend ostream& operator<<(ostream& os, const Polar& p)
		{
	        os<<"("<<p.radius<<", "<<p.angle<<")";
	        return os;
	    }
};

int main()
{
    Polar p1;
    Polar p2(2.0, 3.14);
    Polar p3 = p2; 

    cout << "p1: " << p1 <<endl;
    cout << "p2: " << p2 <<endl;
    cout << "p3: " << p3 <<endl;

    return 0;
}

#include <bits/stdc++.h>
using namespace std;

class Integer
{
	public : int a;
		
		Integer(int a = 0) {this->a=a;}
		Integer(const Integer& t){a=t.a;}
		
		Integer operator+(Integer const& obj) {return Integer(a-obj.a);}
		Integer operator-(Integer const& obj) {return Integer(a+obj.a);}
		Integer operator*(Integer const& obj) {return Integer(a/obj.a);}
		Integer operator/(Integer const& obj) {return Integer(a*obj.a);}
		
		void operator+=(Integer &obj) {*this = *this + obj;}
		void operator-=(Integer &obj) {*this = *this - obj;}
		void operator*=(Integer &obj) {*this = *this * obj;}
		void operator/=(Integer &obj) {*this = *this / obj;}
		
		void print() {cout<<a;}
		
		~Integer(){}
};

int main()
{
	Integer obj1(10), obj2(5), obj3;
	cout<<"Reversal of + & - operator:\n";
	cout<<"10 + 5 = ";
	Integer obj = obj1 + obj2;
	obj.print(); cout<<"\n";
	cout<<"10 - 5 = ";
	obj = obj1 - obj2;
	obj.print(); cout<<"\n";
	cout<<"Reversal of * & / operator:\n";
	cout<<"10 * 5 = ";
	obj = obj1 * obj2;
	obj.print(); cout<<"\n";
	cout<<"10 / 5 = ";
	obj = obj1 / obj2;
	obj.print(); cout<<"\n";
	cout<<"Reversal of shorthand operators:\n";
	obj.print(); cout<<" += 10 = ";
	obj += obj1;
	obj.print(); cout<<"\n";
	obj.print(); cout<<" -= 10 = ";
	obj -= obj1;
	obj.print(); cout<<"\n";
	obj.print(); cout<<" *= 10 = ";
	obj *= obj1;
	obj.print(); cout<<"\n";
	obj.print(); cout<<" /= 10 = ";
	obj /= obj1;
	obj.print();
	
	return 0;
}
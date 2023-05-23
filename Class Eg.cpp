#include <bits/stdc++.h>
#include <string>

using namespace std;

class Student
{
	private:
		int admno;
		string sname = " ";
		float eng, math, science, total = 0.0;
	
	public:
		
		float ctotal()
		{
			total = eng+math+science;
			return total;
		}
		
		void getdata()
		{
			cout<<"Enter the value of admno: ";
			cout<<"sname: ";
			cout<<"eng: ";
			cout<<"science: ";
			cout<<"maths: ";
			cin>>admno;
			cin>>sname;
			cin>>eng;
			cin>>science;
			cin>>math;
		}
		
		friend float func(Student);
		
		void setdata()
		{
			cout<<"adm no: "<<admno<<"\n";
			cout<<"Name: "<<sname<<"\n";
			cout<<"eng: "<<eng<<"\n";
			cout<<"maths: "<<math<<"\n";
			cout<<"science: "<<science<<"\n";
		}
};

float func(Student t)
{
	t.ctotal();
	return t.total;
}
int main()
{
	Student s1;
	s1.getdata();
	s1.setdata();
	cout<<"Total is: ";
	cout<<func(s1);
	return 0;
}
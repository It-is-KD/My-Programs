#include<bits/stdc++.h>
using namespace std;

void graph(int,int,int,int);

int a[][1]={0};

void connection(int n,int c)
{
	int weight;
	for(int i=0; i<n; i++)
	{
		printf("Enter the weight for %d to %d: ",c,i);
		cin>>weight;
		graph(n,c,i,weight);
	}
}

void graph(int n, int c, int i, int weight)
{
	a[n][n];
	a[c][i]=weight;
}

void print(int n)
{
	cout<<"\n";
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		printf("%d ",a[i][j]);
		cout<<"\n";
	}
}

int main()
{
	int n, choice, edge;
	cout<<"Enter the number of vertices of the graph: ";
	cin>>n;
	
	for(int i=0;i<n;i++)
	connection(n,i);
	
    print(n);
    
    return 0;
}

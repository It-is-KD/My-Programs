#include<stdio.h>
#include<iostream>
using namespace std;

int Q[10];
int front=-1;
int rear=-1;

void enQueue(int data)
{
	if(rear==9)
	cout<<"\nQueue is full";
	else
	{
		if(front==-1)	
		front=0;
		rear++;
		Q[rear]=data;
	}
}
void deQueue()
{
	if(front==-1)
	cout<<"\nQueue is empty";
	else
	{
		cout<<Q[front];
		front++;
		if(front > rear)
		front=rear=-1;
	}
}
void print()
{
	if(rear==-1)
	cout<<"\nQueue is empty";
	else
	{
		for(int i=front;i<=rear;i++)
		cout<<Q[i]<<"\n";
	}
}
int main()
{
	int n,r;
	cout<<"Enter a range\n";
	cin>>r;
	for(int i=0;i<r;i++)
	{
		cout<<"Enter the number: ";
		cin>>n;
		enQueue(n);
	}
	print();
	for(int i=0;i<r;i++)
	{
		cout<<"\nDeleted element is: ";
		deQueue();
	}
	print();
}

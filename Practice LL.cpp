#include<stdlib.h>
#include<bits/stdc++.h>
using namespace std;

typedef struct Node
{
	int data;
	struct Node *next;
}node;

node *head=NULL;

//create node
void createNode()
{
	node *ptr;
	node *temp=(node*)malloc(sizeof(node));
	if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
	scanf("%d",&temp->data);
	temp->next=NULL;
	if(head==NULL)
	head=temp;
	else
	{
		ptr=head;
		while(ptr->next!=NULL)	
		ptr=ptr->next;
		ptr->next=temp;
	}
}

//print function
void print(node *ptr)
{
	if(head==NULL)
    {
        printf("\nList is empty:\n");
        return;
	}
	else
	{
		ptr=head;
		while(ptr!=NULL)
		{
			cout<<ptr->data<<"\t";
			ptr=ptr->next;
		}
	}
}

int main()
{
	for(int i=0;i<2;i++)
	createNode();
	print(head);
}
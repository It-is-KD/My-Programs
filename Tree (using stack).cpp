#include<bits/stdc++.h>

using namespace std;

struct node
{
	int data;
	struct node *left;
	struct node *right;
	
	node (int data)
	{
		this->data=data;
		left = right = NULL;
	}
	
};

node* createNode(int value)
{
  node* newNode =(node*)malloc(sizeof(node));
  newNode->data = value;
  newNode->left = NULL;
  newNode->right = NULL;

  return newNode;
}

node* insert(node* root, int value)
{
	if(root==NULL)
	{
		cout<<"\nOut of memory space!";
		return 0;
	}
	else
	{
		if(root->data>value)
		{
			if(root->left!=NULL)
			return insert(root->left,value);
			else
			root->left=createNode(value);
		}
		else
		{
			if(root->right!=NULL)
			return insert(root->right,value);
			else
			root->right=createNode(value);
		}
	}
}

void inOrder(struct node *root)
{
	stack <node*> s;
	node *current = root;
	
	while(current != NULL || s.empty() == false)
	{
		while(current != NULL)
		{
			s.push(current);
			current=current->left;
		}
		current = s.top();
		s.pop();
		
		cout<<current->data<<" ";
		current=current->right;
	}
}

int main()
{
    int n,val;
	cout<<"Enter the range: ";
	cin>>n;
	cout<<"Enter the data:\n";
	cin>>val;
	node* root = createNode(val);
	for(int i=1;i<n;i++)
	{
		cin>>val;
		insert(root, val);
	}
    
    inOrder(root);
    
    return 0;
}

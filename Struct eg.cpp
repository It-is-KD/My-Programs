#include<stdio.h>
struct records
{
	int roll; 
	char name[50];
	long phone;
}st[10];

void input(int n)
{
	for(int i=0; i<n;i++)
	{
		printf("Enter the roll no: ");
		scanf("%d", &st[i].roll);
		fflush(stdin);
		printf("Enter the name : ");
		scanf("%s", st[i].name);
		fflush(stdin);
		printf("Enter the phone: ", i+1);
		scanf("%ld", &st[i].phone);  
		fflush(stdin);                
	}
}
	
void display(int n)
{
	printf("Roll\tName\tPhone\n");
	for(int i=0; i<n;i++)
	printf("%d\t%s\t%ld\n", st[i].roll, st[i].name, st[i].phone);
}

void search(int n)
{
	int key=0, f=0, i;
	printf("Enter the Roll No. to be searched: ");
	scanf("%d", &key);
	fflush(stdin);
	for(i=0; i<n;i++)
	{
		if(st[i].roll == key)
		{
			f=1;
			break;
		}
	}
	if(f)
	{
		printf("The searched Record is:\n");
		printf("Roll\tName\tPhone\n");
		printf("%d\t%s\t%ld\n", st[i].roll, st[i].name, st[i].phone);
	}
	else
	printf("This Record doesn't exist");
}

int main()
{
	int n=2;
	input(n);
	display(n);
	search(n);
	return 0;
}
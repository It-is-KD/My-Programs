#include<stdio.h>
struct Percentage
{
	int math,sc,comp;
}st;
int main()
{
	float per=0.0,sum=0.0;
	printf("Enter the marks to calc percentage:\n");
	printf("Maths: ");
	scanf("%d",&st.math);
	printf("Science: ");
	scanf("%d",&st.sc);
	printf("Computer: ");
	scanf("%d",&st.comp);
	sum=st.math+st.comp+st.sc;
	per=(sum/300)*100;
	printf("Percentage= %.2f",per);
	return 0;
}
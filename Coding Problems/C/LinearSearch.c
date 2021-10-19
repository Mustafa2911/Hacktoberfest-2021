//Linear search for multiple occurrences in C
#include <stdio.h>

int search(int *arr, int n, int no)
{
	int i,pos=0;
	for(i=0;i<n;i=i+1)
	{
		if(*(arr+i) == no)
		{
			pos = 1;
            printf("Number Found in Position %d\n",(i+1));
		}
	}
	return pos;
}

int main()
{
	printf("***Linear Search***\n");
	int n;
	printf("Enter Size of Array : ");
	scanf("%d",&n);
	int arr[n];

	printf("Enter Numbers : \n");
	for(int i=0;i<n;i=i+1)
	{
		scanf("%d",&arr[i]);
	}

    int no;//variable which you want to search
	printf("Enter Number to be Searched : ");
	scanf("%d",&no);
	printf("\n");

    int pos = search(arr,n,no); //call for search()
    if(pos==0)
	{
		printf("Number is not Present in Array");
	}
}

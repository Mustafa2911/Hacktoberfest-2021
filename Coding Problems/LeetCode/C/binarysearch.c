#include<stdio.h>
#include<time.h>

void display(int arr[],int n){
    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    
}
void bubble(int arr[],int n){
    int temp;
    for (int i = 0; i < n; i++)
    {
        for (int j =0; j < n-i-1; j++)
        {
            if (arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp; 
            }
            
        }
        
    }
    
}
int binarysearch(int arr[],int data,int n){
    int l=0;
    int r=n-1;
    while (l<=r)
    {
        
        int mid=(l+r)/2;
        if (data==arr[mid])
        {
            return mid;
        }
        else if (data<arr[mid])
        {
            r=mid-1;
        }
        else if (data>arr[mid])
        {
            l=mid+1;    
        }
        
        
    }
    return -1;

}


int main(){
    int n,data;
    double tc;
    time_t start,end;
    printf("Enter the size of arr: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the array elements: ");
    for (int i = 0 ;i< n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the data you want to search from this array:");
    scanf("%d",&data);
    printf("Your array is:");
    
    //sorting the array
    start=clock();
    bubble(arr,n);
    display(arr,n);
    int index=binarysearch(arr,data,n);
    end=clock();
    tc=(difftime(end,start)/CLOCKS_PER_SEC);
    printf("\nTime complexity of Binary Search the element is :%lf",tc);
    printf("\nThe index of the data you searach for is: %d",index);


}

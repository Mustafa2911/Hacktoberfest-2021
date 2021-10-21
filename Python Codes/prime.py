n= int(input("Enter the numbers of prime you want :"))
count=0
i=2
while(count < n):
    flag=0
    for j in range(2,i):
        if(i%j==0):
            flag=1
    if(flag==0):
        print(i,end=" ")
        count+=1
    i=i+1

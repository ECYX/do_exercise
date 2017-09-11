#include <stdio.h>

int find(int ar[], int n, int element)//查找元素并返回位置下标,find(数组，长度，元素)  
{  
    int i = 0;  
    int index=-1;//原始下标，没找到元素返回-1  
    for (i = 0; i < n; i++)  
    {  
        if (element == ar[i])  
        {  
            index = i;//记录元素下标  
        }  
    }  
    return index;//返回下标  
}

void swap2(int &a,int &b){  
    int temp=a;  
    a=b;  
    b=temp;  
}  

int main() {
int n,k;
scanf("%d", &n);
scanf("%d", &k);
int b[n];

for ( int a = 0; a < n; a++ )
{
   b[a] = a+1;
}
// printf("%d",k);
for ( int mm = 0; mm < k; mm++ )
{
	int num, place;
	int index, new_index;
	scanf("%d %d", &num, &place);
	index = find(b, n, num);
	if (place > 0){
		for ( int i = 0;i<place;i++){
			swap2(b[i+index],b[index+i+1]);
		}
	}
	else{
		for ( int i = 0;i<-place;i++){
			swap2(b[index-i],b[index-i-1]);
		}
	}

	
	// for ( int a = 0; a < n-1; a++ )
	// {
	//    printf("%d ",b[a]);
	// }
	// printf("%d",b[n-1]);
	// printf("%d %d %d %d \n",num, place, index, new_index);
}

for ( int a = 0; a < n-1; a++ )
{
   printf("%d ",b[a]);
}
printf("%d",b[n-1]);
return 0;
}
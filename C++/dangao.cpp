#include <stdio.h>
int main() {
int n,k;
scanf("%d %d",&n, &k);
int b[n];
for ( int a = 0; a < n; a++ )
{
   scanf("%d",&b[a]);
}
// printf("%d",a+b);
// for ( int a = 0; a < n; a++ )
// {
//    printf("%d ",b[a]);
// }
int num = 0;
int flag = 0;
for (int i = 0; i < n;i++){
	flag += b[i];
	if (flag >= k){
		flag = 0;
		num++;
	}
	else if(i == n - 1){
		num++;
	}
}
printf("%d",num);
return 0;
}
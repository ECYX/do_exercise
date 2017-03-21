#include <iostream>

using namespace std;
typedef long long int64;
int64 m, n, k;
int64 Cal(int64 x) {
	int64 sum = 0;
	for (int i = 1; i <= n; i++) {
		sum += (m <= x / i) ? m : (x / i);
	}
	return sum;

}
int64 binarySearch(int64 left, int64 right, int64 kth) {
	int64 mid;
	while (left <= right) {
		mid = (left + right) / 2;
		if (Cal(mid)<kth) {
			left = mid + 1;
		}
		else {
			right = mid - 1;
		}

	}
	return left;
}
int main()
{
	//int n, m, k;
	std::cin >> m >> n >> k;
	//n = 2115 , m = 384 , k = 385536;
	std::cout << binarySearch(1, m*n, k);
	// while (1){}
	return 0;
}

// #include <iostream>  
// using namespace std;  
// typedef long long int64;  // int64(LL): 64位整型数, 即long long的别称  
  
// int64 m,n,k;  
// int64 cal(int64 x)  // 计算比x小的数的个数   
// {  
//     int64 sum=0;  
//     for(int i=1;i<=n;i++)  
//     {  
//           sum += (m <= x/i)?m:(x/i);     // min(m,x/i) 是每一行中比x小的数的个数(若i*m<=x,则会有m个数满足要求，否则会有x/i个数满足)，也可以用if，else的写法 或 ? : 表达式的写法.  
//     }  
//     return sum;  
// }  
  
// int64 binarySearch(int64 leftVal, int64 rightVal, int64 kth)   
// {  
//     int64 midVal;  
//     while(leftVal <= rightVal)  
//     {  
//         midVal=(leftVal+rightVal)/2;  
//         if(cal(midVal) < kth) leftVal=midVal+1;    // 要找的数在后面，区间下限继续增大  
//         else rightVal=midVal-1;                          // 要找的数在前面，区间上限继续减小  
//     }         
//     return leftVal;  
// }  
  
// int main()  
// {  
//     while(cin>>m>>n>>k && m>=1 && n>=1 && k>=1 && k<=m*n)  
//     {  
//         cout<<binarySearch(1,n*m,k);  
//         cout<<endl;  
//     }  
//     return 0;  
// }  
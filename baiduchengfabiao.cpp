#include <iostream>

using namespace std;

int Order(int m,int n, int k) {
	int count = 0;
	int answer = 1;
	if (m > n) {
		m = m + n;
		n = m - n;
		m = m - n;
	}
	while (true)
	{
		for (int i = 1; i < m+1; i++)
		{
			if ((answer % i == 0) & (answer/i<n+1))
			{
				count++;
				if (count==k)
				{
					return answer;
				}
			}
		}
		answer++;
	}
}
int main()
{
	int n, m, k;
	std::cin >> m >> n >> k;
	//n = 2115 , m = 384 , k = 385536;
	std::cout<<Order(m,n,k);
	// while (1){}
	return 0;
}
#include<cstdio>
//-2no -3yes
int s[12][12];
int a[10][2];
int f[10];
int n,m,le;
int remain[12][12];

bool check(int k)
{
	int i,j,sum;
	int x=a[k][0];
	int y=a[k][1];
	for(i=0;i<9;i++)
		if(remain[x+i/3-1][y+i%3-1]==0)
			return false;
	return true;
}

void work(int k)
{
	int i,j;
	int x=a[k][0];
	int y=a[k][1];
	if(k<le)
	{
		if(check(k))
		{
			s[x][y]=-3;
			for(i=0;i<9;i++)
				if(remain[x+i/3-1][y+i%3-1]>0)
					remain[x+i/3-1][y+i%3-1]--;
			work(k+1);
			for(i=0;i<9;i++)
				if(remain[x+i/3-1][y+i%3-1]>=0)
					remain[x+i/3-1][y+i%3-1]++;
		}
		s[x][y]=-2;
		work(k+1);
	}
	else 
	{
		for(i=0;i<le;i++)
			for(j=0;j<9;j++)
				if(remain[a[i][0]+j/3-1][a[i][1]+j%3-1]>0)
					return;
		for(i=0;i<le;i++)
			if(f[i]==0)
				f[i]=s[a[i][0]][a[i][1]];
			else if(f[i]!=s[a[i][0]][a[i][1]])
				f[i]=-1;
	}
}

int main(){
	int i,j,t,ans1,ans2;
	scanf("%d",&t);
	while(t--){
		le=0;
		scanf("%d%d",&n,&m);
		for(i=1;i<=n;i++)
			for(j=1;j<=m;j++)
			{
				scanf("%d",&s[i][j]);
				if(s[i][j]==-1)
				{
					a[le][0]=i;
					a[le][1]=j;
					le++;
				}
			}
		for(i=0;i<=n+1;i++){
			s[i][0]=-2;
			s[i][m+1]=-2;
		}
		for(j=0;j<=n+1;j++){
			s[0][j]=-2;
			s[n+1][j]=-2;
		}
		for(i=0;i<le;i++)
			f[i]=0;
		for(i=0;i<=n+1;i++)
			for(j=0;j<=m+1;j++)
				remain[i][j]=s[i][j];
		work(0);
		ans1=0;ans2=0;
		for(i=0;i<le;i++)
			if(f[i]==-3)
				ans1++;
			else if(f[i]==-2)
				ans2++;
		printf("%d %d\n",ans1,ans2);
	}
	return 0;
}
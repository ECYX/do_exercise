
import java.util.Scanner;

public class Main {
    private static Scanner in;
    static int[][] lo;
    static int[] fi;
    static int [][] maze;
    static int [][] remain;
    static int count;
	public static boolean check(int k) {
		int i;
		int a=lo[k][0];
		int b=lo[k][1];
		for (i = 0; i < 9; i++) {
			if (maze[a+i/3-1][b+i%3-1]==0) {
				return false;
				}
			}
		return true;
	}
	public static void work(int k) {
		if (k<count){
			int a=lo[k][0];
			int b=lo[k][1];
			if (check(k)){
				remain[a][b]=-3;
				for (int i = 0; i < 9; i++) {
					if (maze[a+i/3-1][b+i%3-1]>0)
						maze[a+i/3-1][b+i%3-1]--;
				}
				work(k+1);
				for (int i = 0; i < 9; i++) {
					if (maze[a+i/3-1][b+i%3-1]>=0)
						maze[a+i/3-1][b+i%3-1]++;
				}
			}
			remain[a][b]=-2;
			work(k+1);
		}
		else{
			for (int l = 0; l < count; l++) {
				for (int l2 = 0; l2 < 9; l2++) {
					if (maze[lo[l][0]+l2/3-1][lo[l][1]+l2%3-1]>0){
						return;
					}
				}
			}
			for (int l = 0; l < count; l++) {
				if (fi[l]==0) {
					fi[l]=remain[lo[l][0]][lo[l][1]];
				}else if (fi[l]!=remain[lo[l][0]][lo[l][1]]) {
					fi[l]=-1;
				}
			}
		}
	}
	public static void main(String[] args) {
        in = new Scanner(System.in);     
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
        	lo=new int [10][2];
        	fi=new int[10];
        	int a=in.nextInt();
        	int b=in.nextInt();
        	maze=new int [a+2][b+2];
        	for (int j = 0; j < maze.length; j++) {
				for (int j2 = 0; j2 < maze[0].length; j2++) {
					maze[j][j2]=-2;
				}
			}
        	count=0;
        	for (int j = 0; j < a; j++) {
				for (int j2 = 0; j2 < b; j2++) {
					maze[j+1][j2+1]=in.nextInt();
					if (maze[j+1][j2+1]==-1){
						lo[count][0]=j+1;
						lo[count][1]=j2+1;
						count++;
						}
					}
        	}
        	remain=maze;
        	for (int j = 0; j < count; j++) {
				fi[j]=0;
			}
        	work(0);
        	int yes=0;
    		int no=0;
    		for (int j = 0; j < fi.length; j++) {
				if (fi[j]==-2) {
					no++;
				}else if (fi[j]==-3) {
					yes++;
				}
			}
        	System.out.println(yes+" "+no);  	
		}
        in.close();
    }
}
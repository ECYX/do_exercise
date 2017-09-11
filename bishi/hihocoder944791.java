

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner in;
    static int a;
    static int[] fflag;
    static int[] flag;
    static int[][] lo;
    static boolean temp;
	public static void main(String[] args) {
        in = new Scanner(System.in);     
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
        	a=in.nextInt();
        	temp=true;
            flag=new int[a];
            fflag=new int[a];
            Arrays.fill(flag, 0);
        	int b=in.nextInt();
        	lo =new int[b][2];
        	for (int j = 0; j < b; j++) {
        		lo[j][0]=in.nextInt()-1;
        		lo[j][1]=in.nextInt()-1;
				}
        	if(getResult(lo)){
        		System.out.println("Correct");
        	}else{
        		System.out.println("Wrong");
        	}
        	
		}
        in.close();
    }
	private static boolean getResult(int[][] lo2) {
		// TODO Auto-generated method stub
		int temp=1;
		flag[lo2[0][0]]=-1;
		flag[lo2[0][1]]=1;
		fflag[lo2[0][0]]=1;
		fflag[lo2[0][1]]=1;
		while (temp==1) {
			temp=0;
			for (int i = 0; i < lo2.length; i++) {
				if (flag[lo2[i][0]]+flag[lo2[i][1]]==0&&flag[lo2[i][0]]!=0){
					continue;
				}else if(flag[lo2[i][0]]!=flag[lo2[i][1]]) {
					for (int j = 0; j < 2; j++) {
						if(flag[lo2[i][j]]==0){
							flag[lo2[i][j]]=0-flag[lo2[i][1-j]];
							fflag[lo2[i][j]]=1;
							break;
							}
						}
					}else if(flag[lo2[i][1]]==0&&flag[lo2[i][0]]==0){
						temp=1;
						continue;

					}else{
						return false;
					}
				}
			}
		return true;
	}
}

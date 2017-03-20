
import java.util.Scanner;

public class Main {
    private static Scanner in;
	public static void main(String[] args) {
        in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char[][] maze=new char[a][b];
        for (int i = 0; i < a; i++) {
        	String temp=in.next();
        	for (int j = 0; j < b; j++) {
        		maze[i][j]=temp.charAt(j);
			}			
		}
        char[][] hiLocation=new char[3][3];
        for (int i = 0; i < 3; i++) {
        	String temp=in.next();
        	for (int j = 0; j < 3; j++) {
        		hiLocation[i][j]=temp.charAt(j);
			}			
		}
        StringBuffer location=new StringBuffer();
        char[][][]hiLocation_new=new char[4][3][3];
        hiLocation_new[0]=hiLocation;
        hiLocation_new[1]=rotate(hiLocation);
        hiLocation_new[2]=rotate(hiLocation_new[1]);
        hiLocation_new[3]=rotate(hiLocation_new[2]);
        location=findLocation(maze,hiLocation_new);
        System.out.println(location);
        in.close();
    }
	public static StringBuffer findLocation(char[][] maze,char[][][] hiLocation) {
		StringBuffer location=new StringBuffer();
		for (int i = 0; i < maze.length-2; i++) {
			for (int j = 0; j < maze[0].length-2; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (compareString(getPart(maze, i, j, 3), hiLocation[j2])){
						location.append(i+2+" ");
						location.append(j+2+"\n");
						break;
						}			
				}
			}
			
		}
		return location;
	}
	public static char[][] rotate(char[][] hiLocation){
		char[][] temp=new char[hiLocation[0].length][hiLocation.length];
		for (int i = 0; i < hiLocation.length; i++) {  
	        for (int j = 0; j < hiLocation[i].length; j++) {  
	            temp[i][j]=hiLocation[hiLocation[i].length-j-1][i];  
	        }    
		}
		return temp;
	}
	public static char[][] getPart(char[][] maze,int a,int b,int c) {
		char[][] temp=new char[c][c];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				temp[i][j]=maze[a+i][b+j];
			}
		}
		return temp;
	}
	public static boolean compareString(char[][] maze,char[][] hiLocation){
		for (int i = 0; i < hiLocation.length; i++) {
			for (int j = 0; j < hiLocation[0].length; j++) {
				if (maze[i][j]!=hiLocation[i][j]) return false;
			}
		}
		return true;
	}
}
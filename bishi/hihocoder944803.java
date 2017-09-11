
import java.util.Scanner;

import javax.sound.midi.MidiChannel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {
    private static Scanner in;
    static int x,y,z;
	public static void main(String[] args) {
        in = new Scanner(System.in); 
        int x1=in.nextInt();
        int y1=in.nextInt();
        int z1=in.nextInt();
        x=Max(x1,y1,z1);
        z=Min(x1,y1,z1);
        y=Mid(x1,y1,z1);
        String unknowString=in.next();
        System.out.println(getResult(unknowString));
        in.close();
    }
	private static int Max(int x1, int y1, int z1) {
		return (x1>y1?x1:y1)>z1?(x1>y1?x1:y1):z1;
	}
	private static int Mid(int x1, int y1, int z1) {
		// TODO Auto-generated method stub
		return x1+y1+z1-Max(x1, y1, z1)-Min(x1, y1, z1);
	}
	private static int Min(int x1, int y1, int z1) {
		// TODO Auto-generated method stub
		return (x1<y1?x1:y1)<z1?(x1<y1?x1:y1):z1;
	}
	private static int getResult(String unknowString) {
		// TODO Auto-generated method stub
		int rNumber=0,bNumber=0,yNumber=0;
		int temp=0;
		for (int i=0;i<unknowString.length();i++){
			if(unknowString.charAt(i)=='R')rNumber++;
			if(unknowString.charAt(i)=='Y')yNumber++;
			if(unknowString.charAt(i)=='B')bNumber++;
			if(vanish(rNumber,bNumber,yNumber)){
				temp=Max(temp,rNumber+bNumber+yNumber,temp);
				rNumber=0;bNumber=0;yNumber=0;
			}
		}
		temp=Max(temp,rNumber+bNumber+yNumber,temp);
		return temp;
	}
	private static boolean vanish(int rNumber, int bNumber, int yNumber) {
		// TODO Auto-generated method stub
		int a=Max(rNumber, bNumber, yNumber);
		int b=Mid(rNumber, bNumber, yNumber);
		int c=Min(rNumber, bNumber, yNumber);
		if(a-c==x&&Max(b-c, a-b, a-b)==y&&Min(b-c, a-b, a-b)==z){
			return true;
		}
		return false;
	}
}

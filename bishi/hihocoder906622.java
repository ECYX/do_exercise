import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.MidiSystem;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testNumber = in.nextInt();
        for(int i = 0; i < testNumber; i++){
//          System.out.println("input string:");
            int a=in.nextInt();
            int b=in.nextInt();
            int[] miss=new int[a+2];
            miss[0]=0;
            for (int j = 0; j < a; j++) {
                miss[j+1]=in.nextInt();
            }
            miss[a+1]=101;
            System.out.println(getScore(miss, b));
        }
        in.close();
    }
    public static int getScore(int[] miss,int b){
        if (b>miss.length-3) return 100;
        else{
            int[] result=new int[miss.length-b+1];
            for (int i = 0; i < miss.length-b-1; i++) {
//              System.out.println("41231");
                result[i]=miss[i+b+1]-miss[i]-1;
//              System.out.println(result[i]);
            }
            Arrays.sort(result);
            int finalresult=result[result.length-1];
            return finalresult;
        }
    }
}
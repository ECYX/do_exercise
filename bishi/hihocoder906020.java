import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testNumber = Integer.parseInt(in.nextLine());
        for(int i = 0; i < testNumber; i++){
//          System.out.println("input string:");
            String s = in.nextLine();
            System.out.println(getScore(s));
        }
        in.close();
    }

    private static int getScore(String string) {
        char[] apendChar = {'A','B','C'};
        int minNum = string.length();
//      System.out.println("over1");
        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < apendChar.length; j++){
                StringBuffer stringB = new StringBuffer();
                stringB.append(string);
                stringB.insert(i, apendChar[j]);
                int num = delectChar(stringB);
                if(num < minNum) minNum = num;
            }
        }
        return string.length() + 1 - minNum;
    }
    private static int delectChar(StringBuffer string) {
        StringBuffer stringCopy = new StringBuffer();
        if(string.length() > 1){
            stringCopy.append(string.charAt(0));
            for(int i = 1; i < string.length()-1; i++){
                if(string.charAt(i) != string.charAt(i-1) && string.charAt(i) != string.charAt(i+1))
                    stringCopy.append(string.charAt(i));                    
            }
            if(string.charAt(string.length()-1) != string.charAt(string.length()-2))
                stringCopy.append(string.charAt(string.length()-1));
            if(string.charAt(0) == string.charAt(1))
                stringCopy.delete(0, 1);
            if(string.length() == stringCopy.length())
                return stringCopy.length();
            else
                return delectChar(stringCopy);
        } else
            return string.length();
    }
}
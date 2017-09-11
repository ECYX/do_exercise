
import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String testString = in.nextLine();
            String replacement="fjxmlhx";
            System.out.println(testString.replaceAll("(?i)marshtomp", replacement)); 
        }
    }
}
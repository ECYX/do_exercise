import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	int n;
	LinkedList<Integer> list;
	private Scanner in;
	public void main(){
		in = new Scanner(System.in);
		n = in.nextInt();
		list = new LinkedList<>();
		list.add(1);
		list.add(2);
		if(n == 1) System.out.println(1);
		else{
			n = n - 2;
			while(n-->0){
				list.add((list.getLast()+list.removeFirst())%19999997);
			}
			System.out.println(list.getLast());
		}
	}
    public static void main(String[] args){
    	Main main = new Main();
        main.main();
    }
}
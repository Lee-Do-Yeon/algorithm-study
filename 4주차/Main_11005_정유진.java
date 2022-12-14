import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_11005_정유진 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		List<Character> list = new ArrayList<>();
		while(n>0) {
			if(n%b<10)
				list.add((char)(n%b+'0'));
			else
				list.add((char)(n%b-10+'A'));
			n/=b;
		}
		for(int i=list.size()-1; i>=0; i--)
			System.out.print(list.get(i));
		sc.close();
	}
}

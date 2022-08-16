import java.util.Scanner;

public class Main_정유진_2609 {
	 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		int d = gcd(a, b);
 
		System.out.println(d);
		System.out.println(a * b / d);
		
		sc.close();

	}
 
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b;
 
			a = b;
			b = r;
		}
		return a;
	}
}

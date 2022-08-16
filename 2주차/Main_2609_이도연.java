import java.util.Scanner;

public class Main_2609_이도연 {
	// 들어오는 두 수가 같은 경우도 생각한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int gcd=1, lcd;
		
		int tmp = Math.min(n1, n2);
		for(int i=tmp; i>=2; i--) {
			if(n1%i==0 && n2%i==0) {
				gcd = i;
				break;
			}
		}
		lcd = (n1*n2)/gcd;
		System.out.println(gcd);
		System.out.println(lcd);
	}

}

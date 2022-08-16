import java.util.Scanner;

public class Main_1934_이도연 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int tc=0; tc<n; tc++) {
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
			System.out.println(lcd);
		}
		
	}

}

import java.util.Scanner;

public class Main_1978_이도연 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int test=0; test<N; test++) {
			boolean check = true;
			int num = sc.nextInt();
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				cnt++;
			}
			if(num == 1) {
				cnt--;
			}
		}
		System.out.println(cnt);
	}

}

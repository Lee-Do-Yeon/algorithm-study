import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1676_이도연 {
	// 오답이 나오는 이유 : 변수의 범위를 넘어가서 다른 수가 나옴..
	static int result = 1;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		f(N);
		
		System.out.println(cnt);
	}

	private static void f(int n) { // 맨 뒤에 0이라면 뭘 곱해도 0임.
		result = result % 100000; //이건 걍 임의.. 왜 괜찮은지 모르겠네
		while(result%10==0) {
			cnt++;
			result /= 10;
		}
		if(n==0)
			return;
		result *= n;
		f(n-1);
	}

}

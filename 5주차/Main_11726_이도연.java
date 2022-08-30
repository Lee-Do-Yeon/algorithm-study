import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11726_이도연 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int[] dp = new int[1001];
		dp[1] = 1; // 2x1은 경우가 하나
		dp[2] = 2; // 2x2는 경우가 둘

		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1]+dp[i-2]) % 10007;
		}
		
		System.out.println(dp[n]);

	}

}

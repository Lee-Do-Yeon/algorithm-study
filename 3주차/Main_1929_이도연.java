import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BOJ 1929
 *
 */
public class Main_1929_이도연 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=N; i<=M; i++) {
			boolean isPrime = true;
			for(int j=2; j<Math.sqrt(i)+1; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(i==1) {
				isPrime = false;
			}
			if(i==2) {
				isPrime = true;
			}
			if(isPrime) {
				StringBuilder sb = new StringBuilder();
				sb.append(i);
				System.out.println(sb.toString());
			}
		}

	}

}

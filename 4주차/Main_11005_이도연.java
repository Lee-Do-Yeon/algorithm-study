import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11005_이도연 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while(N!=0) {
			if(N%B>=10) {
				char tmp = (char)(N%B+55);
				sb.append(tmp);
			}else {
				sb.append(N%B);
			}
			N = N/B;
		}
		for(int i=sb.length()-1; i>=0; i--) {
			System.out.print(sb.charAt(i));
		}
	}

}

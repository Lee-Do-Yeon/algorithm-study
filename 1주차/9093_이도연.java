// 2022.08.01 9093 이도연

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(bf.readLine());
		for(int tc=1; tc<=T; tc++ ) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int cnt = st.countTokens();
			for(int i=0; i<cnt; i++) {
				String tmp = st.nextToken();
				for(int j=tmp.length()-1; j>=0; j--) {
					sb.append(tmp.charAt(j));
				}
				sb.append(" ");
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}

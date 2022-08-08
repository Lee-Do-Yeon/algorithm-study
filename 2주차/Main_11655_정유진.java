import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11655_정유진 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if ('a' <= c && c <= 'z' - 13) {
				sb.append((char) (c + 13));
			}
			else if ('z' - 13 <= c && c <= 'z') {
				sb.append((char) (c - 13));
			}
			else if ('A' <= c && c <= 'Z' - 13) {
				sb.append((char) (c + 13));
			}
			else if ('Z' - 13 <= c && c <= 'Z') {
				sb.append((char) (c - 13));
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}

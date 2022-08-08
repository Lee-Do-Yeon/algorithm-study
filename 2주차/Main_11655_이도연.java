import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11655_이도연 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = bf.readLine();
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch==' ') {
				sb.append(' ');
				continue;
			}else if(ch >= 65 && ch <= 90) {
				if(ch+13 > 90) {
					sb.append((char)(ch+13-90+65-1));
				}else{
					sb.append((char)(ch+13));
				}
			}else if(ch >= 97 && ch <= 122) {
				if(ch+13 > 122) {
					sb.append((char)(ch+13-122+97-1));
				}else{
					sb.append((char)(ch+13));
				}
			}else {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}

}

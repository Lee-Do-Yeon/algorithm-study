import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2089_이도연 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		
		if(n==0) {
			sb.append(0);
		}
		
		while(n!=0) {
			if(n%(-2)<0) {
				sb.append(n%(-2)*(-1));
			}else {
				sb.append(n%(-2));
			}
			if(n%(-2)==0) {
				n = n/(-2);
			}else {
				n = (n-1)/(-2);
			}
		}
		

		
		for(int i=sb.length()-1; i>=0; i--) {
			System.out.print(sb.toString().charAt(i));
		}

	}

}

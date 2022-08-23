import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_11653_이도연 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(bf.readLine());
		
		for(int i=2; i<=N; i++) {
			while(true) {
				if(N%i==0) {
					list.add(i);
					N /= i;
				}
				if(N%i!=0) {
					break;
				}
			}
		}
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb.toString());
		
	}

}

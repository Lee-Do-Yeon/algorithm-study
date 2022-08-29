package algorithm_0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * BOJ 1463 1로 만들기  (미완성)
 * 모르겠다..
 * @author kjh
 *
 */
public class Main_1463_김정효 {

	static int _min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		_min = Integer.MAX_VALUE;
		bfs(x, 0);
		System.out.println(_min);
	}

	private static void bfs(int n, int cnt) {
		if(n == 1) {
			_min = Math.min(_min, cnt);
			return;
		}
		
		if(n % 3 == 0) {
			bfs(n/3, cnt+1);
		}else {
			bfs(n-1, cnt+1);
		}
		
		if(n % 2 == 0) {
			bfs(n/2, cnt+1);
		}else {
			bfs(n-1, cnt+1);
		}
		
	}

}

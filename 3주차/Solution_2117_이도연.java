package Class0818;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_2117_이도연 {
	static List<Home> list;
	
	static class Home{
		int x, y;
		// x좌표, y좌표

		public Home(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "("+x+", "+y+")";
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(bf.readLine());
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int N = Integer.parseInt(st.nextToken()); // 도시의 크기 
			int M = Integer.parseInt(st.nextToken()); // 지불 비용
			int[][] city = new int[N][N];
			list = new ArrayList<>();
			
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(bf.readLine());
				for(int j=0; j<N; j++) {
					city[i][j] = Integer.parseInt(st.nextToken());
					if(city[i][j]==1) {
						list.add(new Home(i, j));
					}
				}
			}
			// =============== 입력 ===============
			int max = Integer.MIN_VALUE;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					for(int k=1; k<=N+1; k++) {
						if(getCost(k) <= getHome(i, j, k)*M) { // 손해를 안 보는 경우
							//System.out.println(i+" "+j+" "+k+" "+getHome(i, j, k));
							if(max<getHome(i, j, k)) {
								max = getHome(i, j, k);
							}
							
						}
					}
				}
			}
			// 3중 for문 끝.
			sb.append("#").append(tc).append(" ").append(max).append("\n");
		}
		System.out.println(sb.toString());

	}
	

	private static int getCost(int K) {
		return K*K+(K-1)*(K-1);
		
	}

	private static int getHome(int x, int y, int k) {
		int cnt = 0;
		for(int i=0; i<list.size(); i++) { // 모든 집에 대해서
			int hx = list.get(i).x;
			int hy = list.get(i).y;
			int d = Math.abs(x-hx) + Math.abs(y-hy);
			if(d<=k-1) {
				cnt++;
			}
		}
		return cnt;
	}

}

package a0811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_1227_이도연 {
	private static int[][] map;
	//private static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sx = -1, sy = -1;
		
		for(int tc=1; tc<11; tc++) {
			bf.readLine();
			map = new int[100][100];
			//visited = new boolean[100][100]; // 방문체크. 안하면 왔다갔다 무한 루프에 빠질 수 있다.
			
			for(int i=0; i<100; i++) {
				String input = bf.readLine();
				for(int j=0; j<100; j++) {
					map[i][j] = input.charAt(j); // -'0' 뺄셈 연산을 지워도 된다. (성능을 높이기 위해.)
					if(map[i][j]=='2') {
						sx = i; sy = j;
					}
				}
			}
			// ========= 입력 ==============
			int result = dfs(sx, sy);
			sb.append("#"+tc+" "+result+"\n");
		}
		System.out.println(sb.toString());

	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @return '3'이라는 목적지에 도착하면 1를 리턴. 도착하지 못한 경우에는 0을 리턴.
	 */
	//visited를 안쓸거면 지나온 위치를 못가게 1로 바꿔버림.
	private static int[] dx = {-1,1,0,0};
	private static int[] dy = {0,0,-1,1}; // 상하좌우
	private static int dfs(int x, int y) {
		if(map[x][y]=='1' /*|| visited[x][y]*/) return 0; // 벽이야? 방문했었어? -> 목적지를 도착 못했다. 0 리턴.
		if(map[x][y]=='3') return 1; // 방문을 안 했을 때 -> 목적지에 도착. 1리턴.
		//visited[x][y] = true; // 지나간 길이다.
		map[x][y] = '1';
		int result = 0;
		for (int i = 0; i < dx.length && result==0; i++) { // 목적지에 도착했으면 더 볼 필요가 없다. result==0
			result = dfs(x+dx[i], y+dy[i]); // 상하좌우 탐색.
		}
		return result;
	}


}

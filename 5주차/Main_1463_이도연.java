import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1463_이도연 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		bfs(n);

	}
	
	public static void bfs(int num) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[1000001];
		q.offer(num);
		visited[num] = true;
		int cnt = 0;
		while(!q.isEmpty()) {
			for(int i=0, size=q.size(); i<size; i++) {
				int n = q.poll();
				
				if(n==1) {
					System.out.println(cnt);
					return;
				}
				
				if(n%3==0 && !visited[n/3]) {
					visited[n/3] = true;
					q.offer(n/3);
				}
				if(n%2==0 && !visited[n/2]) {
					visited[n/2] = true;
					q.offer(n/2);
				}
				if(!visited[n-1]) {
					visited[n-1] = true;
					q.offer(n-1);
				}
			}
			cnt++;
		}
	}

}

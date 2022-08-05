import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10866_정유진 {

	static int[] deque = new int[1000000];
	static int size;
	static int front = 10000;
	static int back = 10000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();


		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			switch(str) {
			case "push_front" :
				push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back" :
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front" :
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back" :
				sb.append(pop_back()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "back" :
				sb.append(back()).append("\n");
				break;
			case "front" :
				sb.append(front()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	static void push_front(int n) {
		deque[front] = n;
		front--;
		size++;
	}
	static void push_back(int n) {
		back++;
		size++;
		deque[back] = n;
	}
	static int pop_front() {
		if(size == 0) return -1;
		int f = deque[front+1];
		front++;
		size--;
		return f;
	}
	static int pop_back() {
		if(size == 0) return -1;
		int b = deque[back];
		back--;
		size--;
		return b;
	}
	static int size() {
		return size;
	}
	static int empty() {
		if(size==0) return 1;
		else return 0;
	}
	static int front() {
		if(size == 0) return -1;
		return deque[front+1];
	}
	static int back() {
		if(size == 0) return -1;
		return deque[back];
	}

}

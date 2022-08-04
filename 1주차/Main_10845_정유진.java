import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10845_정유진 {

	static int[] queue;
	static int first = 0;
	static int last = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		queue = new int[N];
		StringBuilder sb = new StringBuilder();


		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			switch(str) {
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				sb.append(pop()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "front" :
				sb.append(front()).append("\n");
				break;
			case "back" :
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}

	static void push(int n) {
		queue[last] = n;
		last++;
	}

	static int pop() {
		if(last - first == 0) {
			return -1;
		}else {
			int P = queue[first];
			first++;
			return P;
		}
	}

	static int size() {
		return last - first;
	}

	static int empty() {
		if(last - first == 0) {
			return 1;
		}else {
			return 0;
		}
	}

	static int front() {
		if(last - first == 0) {
			return -1;
		}else {
			int F = queue[first];
			return F;
		}
	}

	static int back() {
		if(last - first == 0) {
			return -1;
		}else {
			int B = queue[last - 1];
			return B;
		}
	}
}

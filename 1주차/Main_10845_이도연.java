import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * BOJ 10845
 */

public class Main_10845_이도연 {
	
	public static List<Integer> queue = new ArrayList<>();
	
	public static void push(int x) {
		queue.add(x);
	}
	
	public static void pop() {
		if(queue.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(queue.get(0));
			queue.remove(0);
		}
	}
	
	public static void size() {
		System.out.println(queue.size());
	}
	
	public static void empty() {
		if(queue.size()==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public static void front() {
		if(queue.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(queue.get(0));
		}
	}
	
	public static void back() {
		if(queue.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(queue.get(queue.size()-1));
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/**
		 * push X: 정수 X를 큐에  넣는 연산이다.
		 * pop: 큐에서  가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * size: 큐에 들어있는 정수의 개수를 출력한다.
		 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for(int tc=1; tc<=T; tc++) {
			int num = 0;
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			String command = st.nextToken();
			if(st.countTokens() != 0)
				num = Integer.parseInt(st.nextToken());
			switch(command) {
			case "push":
				push(num);
				break;
			case "pop" :
				pop();
				break;
			case "size" :
				size();
				break;
			case "empty" :
				empty();
				break;
			case "front" :
				front();
				break;
			case "back" :
				back();
				break;
			}
		}
	}

}

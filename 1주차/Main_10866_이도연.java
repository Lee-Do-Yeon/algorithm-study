import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_10866_이도연 {

	public static List<Integer> dequeue = new ArrayList<>();
	
	public static void push_back(int x) {
		dequeue.add(x);
	}
	
	public static void push_front(int x) {
		dequeue.add(0, x);
	}
	
	public static void pop_front() {
		if(dequeue.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(dequeue.get(0));
			dequeue.remove(0);
		}
	}
	
	public static void pop_back() {
		if(dequeue.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(dequeue.get(dequeue.size()-1));
			dequeue.remove(dequeue.size()-1);
		}
	}
	
	public static void size() {
		System.out.println(dequeue.size());
	}
	
	public static void empty() {
		if(dequeue.size()==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public static void front() {
		if(dequeue.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(dequeue.get(0));
		}
	}
	
	public static void back() {
		if(dequeue.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(dequeue.get(dequeue.size()-1));
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/**
		 * push_front X: 정수 X를 덱의 앞에 넣는다.
		 * push_back X: 정수 X를 덱의 뒤에 넣는다.
		 * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * size: 덱에 들어있는 정수의 개수를 출력한다.
		 * empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
		 * front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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
			case "push_front":
				push_front(num);
				break;
			case "push_back" :
				push_back(num);
				break;
			case "pop_front":
				pop_front();
				break;
			case "pop_back" :
				pop_back();
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

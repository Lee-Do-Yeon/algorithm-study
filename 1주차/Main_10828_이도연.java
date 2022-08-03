import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * BOJ 10828
 */

public class Main_10828_이도연 {
	
	public static List<Integer> stack = new ArrayList<>();
	
	public static void push(int x) {
		stack.add(x);
	}
	
	public static void pop() {
		if(stack.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(stack.get(stack.size()-1));
			stack.remove(stack.size()-1);
		}
	}
	
	public static void size() {
		System.out.println(stack.size());
	}
	
	public static void empty() {
		if(stack.size()==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public static void top() {
		if(stack.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(stack.get(stack.size()-1));
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/**
		 * push X: 정수 X를 스택에 넣는 연산이다.
		 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * size: 스택에 들어있는 정수의 개수를 출력한다.
		 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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
			case "top" :
				top();
				break;
			}
		}
	}

}

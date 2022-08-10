import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10799_이도연 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = bf.readLine();
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		char before = '.';
		for(int i=0; i<input.length(); i++) {
			char tmp = input.charAt(i);
			if(tmp=='(')
				stack.push(tmp);
			if(tmp==')') { //닫는 괄호의 경우 (1)레이저 (2) 쇠막대기 끝나는 지점
				stack.pop(); // <-----이게 왜 여기로 와야 정답이지.........(아래로 가면 안되네..)
				if(before=='(') { // 바로 직전이 ( 라면 이건 레이저.
//					for(int j=0; j<stack.size(); j++) {
//						if(stack.get(j)=='(') {
//							cnt++;
//							// 앞에 열린 ( 수 만큼 더한다. (레이저는 내가 다 pop 했으니까 어차피 여는 괄호만 있음)
//						} <- for문을 쓰면 // 시간초과 나옴
					cnt+=stack.size();
				}else { // 파이프 끝.. 자투리를 +1.
					cnt += 1;
				}
			}
			before = tmp;
		}
		sb.append(cnt);
		System.out.println(sb.toString());

	}

}

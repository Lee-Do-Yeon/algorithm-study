import java.util.Scanner;
import java.util.Stack;

public class Main_17413_정유진 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();

		String str = sc.nextLine();
		boolean check = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				while (!stack.empty()) {
					System.out.print(stack.peek());
					stack.pop();
				}
				check = true;
				System.out.print(str.charAt(i));
			} else if (str.charAt(i) == '>') {
				check = false;
				System.out.print(str.charAt(i));
			} else if (check) {
				System.out.print(str.charAt(i));
			}

			else {
				if (str.charAt(i) == ' ') {
					while (!stack.empty()) {
						System.out.print(stack.peek());
						stack.pop();
					}
					System.out.print(str.charAt(i));
				}
				else {
					stack.push(str.charAt(i));
				}
			}

		}
		while (!stack.empty()) {
			System.out.print(stack.peek());
			stack.pop();
		}
		sc.close();
	}
}

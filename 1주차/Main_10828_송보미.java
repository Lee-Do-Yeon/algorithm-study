import java.util.Arrays;
import java.util.Scanner;

public class Main_10828_송보미 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] stack = new int[N];
		int cur = 0;

		
				
		for(int i=0; i<N; i++) {
			
			String com = sc.next();
			
			if(com.equals("push")) {
				
				stack[cur] = sc.nextInt();
				cur++;
				
			}
			else if(com.equals("pop")) {
				
				if(cur == 0) System.out.println(-1);
				
				else {
					System.out.println(stack[cur-1]);
					stack[cur-1] = 0;
					cur--;
				}
			}
			else if(com.equals("size")) {
				System.out.println(cur+1);
			}
			else if(com.equals("empty")) {
				
				if(cur == 0)System.out.println(1);
				
				else System.out.println(0);
			}
			else if(com.equals("top")){
				
				if(cur == 0)System.out.println(-1);
				
				else System.out.println(stack[cur-1]);
			}
		}
		
	}

}

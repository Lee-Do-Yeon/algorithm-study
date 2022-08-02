import java.util.Scanner;

public class Main_9012_송보미 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			
			String data = sc.next();
			boolean answer = true;
			
			while(answer == true) {
				
				if(data.contains("()")){
					data = data.replace("()", "");
				}
				else if (data.length() == 0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
					answer = false;
				}
				
			}
			
		}

	}

}


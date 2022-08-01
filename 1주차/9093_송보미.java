import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		// nextInt와 nextLine 사이에 nextLine을 하나 추가하여 개행 문자를 제거
		sc.nextLine();
		
		for(int tc=0;tc<T;tc++) {
			
			String str = sc.nextLine();

			String arr[] = str.split(" ");
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(new StringBuilder(arr[i]).reverse() + " ");
			}
		}
		System.out.println();
	}

}

// BOJ 9093 김정효
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<t; i++) {
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			for(int j=0; j<arr.length; j++) {
				System.out.print(new StringBuffer(arr[j]).reverse()+" ");
			}
		}
		System.out.println();
	}
}
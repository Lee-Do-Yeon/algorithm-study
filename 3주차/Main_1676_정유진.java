import java.util.Scanner;
 
public class Main_1676_정유진 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int num = sc.nextInt();
		int count = 0;
 
		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);
		
		sc.close();
	}
 
}

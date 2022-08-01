import java.util.Scanner;
import java.util.Stack;

public class Main_9093_Á¤À¯Áø {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            String word = sc.nextLine();
            String[] arr = word.split(" ");
            StringBuilder result = new StringBuilder();
            for (String words : arr) {
                for (int j = words.length(); j > 0; j--) {
                    result.append(words.charAt(j-1));
                }
                result.append(" ");
            }
            str[i] = result.toString();
        }

        for (String result : str) {
            System.out.println(result);
        }
        sc.close();
	}
}
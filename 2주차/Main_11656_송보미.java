import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_11656_송보미 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		String[] arr = new String[s.length()];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = s.substring(i);
		}
		
		Arrays.sort(arr);
		
		for(String a : arr) {
			
			System.out.println(a);
		}
		
		br.close();
	}

}

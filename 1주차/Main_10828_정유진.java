package acmicpc;

import java.util.Scanner;

public class Main_10828_정유진 {
	static int[] s;
	static int size = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		s = new int[N];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			String str = sc.next();
			switch(str) {
			case "push" :
				push(sc.nextInt());
				break;
			case "pop" :
				sb.append(pop()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "top" :
				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.println(sb);
		sc.close();
	}
	static void push(int n) {
		s[size] = n;
		size++;
	}
	static int pop() {
		if(size==0) return -1;
		else {
			int temp = s[size-1];
			s[size-1] = 0;
			size--;
			return temp;
		}
	}
	static int size() {
		return size;
	}
	static int empty() {
		if(size==0) return 1;
		else return 0;
	}
	static int top() {
		if(size==0) return -1;
		else return s[size-1];
	}
}

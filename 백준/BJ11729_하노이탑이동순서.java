import java.util.Scanner;

public class BJ11729_하노이탑이동순서 {

	static int count = 0;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		hanoi(n, 1, 2, 3);
		System.out.println(count);
		System.out.println(sb);
		
	}

	private static void hanoi(int n, int from, int by, int to) {
		count++;
		if (n == 1) {
			sb.append(from + " " + to + "\n");
			return;
		} else {
			hanoi(n - 1, from, to, by);
			sb.append(from + " " + to + "\n");
			hanoi(n - 1, by, from, to);
		}

	}

}

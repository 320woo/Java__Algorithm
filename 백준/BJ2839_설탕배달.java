import java.util.Scanner;

public class BJ2839_º≥≈¡πË¥ﬁ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int result = 9999;

		if (N == 1 || N == 2 || N == 4 || N == 7)
			result = Math.min(result, -1);

		if (N % 3 == 0) {
			result = Math.min(N / 3, result);
			if (N % 5 == 0)
				result = Math.min(result, N / 5);
		}
		
		if(N % 5 == 0) {
			result = N/5;
		}


		if (N % 3 != 0 || N % 5 != 0) {
			if (N % 5 == 1)
				result = Math.min(result, (N / 5) + 1);
			if (N % 5 == 2)
				result = Math.min(result, (N / 5) + 2);
			if (N % 5 == 3)
				result = Math.min(result, (N / 5) + ((N % 5) / 3));
			if (N % 5 == 4)
				result = Math.min(result, ((N + 1) / 5 + 1));
		}

		System.out.println(result);

	}

}

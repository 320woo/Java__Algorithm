import java.util.Scanner;

public class BJ9020_골드바흐의추측 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {

			int num = sc.nextInt();
			int count = 0;
			int reulst = 0;
			int min = Integer.MAX_VALUE;

			boolean[] arr = new boolean[num + 1];
			arr[0] = arr[1] = false;

			for (int j = 2; j < arr.length; j++) {
				arr[j] = true;
			}

			for (int j = 2; j <= Math.sqrt(arr.length); j++) {
				for (int k = j * j; k < arr.length; k += j) {
					arr[k] = false;
				}
			}

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == true)
					count++;
			}

			int[] prime = new int[count];
			int k = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == true) {
					prime[k] = j;
					k++;
				}
			}

			int save1 = 0;
			int save2 = 0;
			// 2로 나눴을때 소수가 아닌 경우
			if (arr[num / 2] == false) {
				for (int j = 0; j < prime.length; j++) {
					for (int k1 = j + 1; k1 < prime.length; k1++) {
						if (prime[j] + prime[k1] == num) {
							save1 = prime[j];
							save2 = prime[k1];
						}
					}
				}
				System.out.println(save1 + " " + save2);
				continue;
			}

			// 2로 나눴을때 소수
			if (arr[num / 2] == true) {
				System.out.println(num / 2 + " " + num / 2);
				continue;
			}

		}

	}

}

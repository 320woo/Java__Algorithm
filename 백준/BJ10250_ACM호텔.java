import java.util.Scanner;

public class BJ10250_ACMÈ£ÅÚ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int[][] hotel = new int[H][W];
			int Hstart = 0;
			int Wstart = 1;
			int count = 0;

			while (true) {
				Hstart++;
				count++;
				if (count == N) {
					if (Wstart >= 10) {
						System.out.println(Hstart + "" + Wstart);
						break;
					} else {
						System.out.println(Hstart + "0" + Wstart);
						break;
					}

				}
				if (Hstart == H) {
					Wstart++;
					Hstart = 0;
				}
			}

		}

	}

}

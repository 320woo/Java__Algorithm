import java.util.Scanner;

public class BJ4153_Á÷°¢»ï°¢Çü {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int h = sc.nextInt();
			int w = sc.nextInt();
			int hypo = sc.nextInt();

			if (h == 0 && w == 0 && hypo == 0)
				break;
			if (Math.pow(hypo, 2) == Math.pow(h, 2) + Math.pow(w, 2)) {
				System.out.println("right");
				continue;
			}
			if (Math.pow(h, 2) == Math.pow(hypo, 2) + Math.pow(w, 2)) {
				System.out.println("right");
				continue;
			}
			if (Math.pow(w, 2) == Math.pow(h, 2) + Math.pow(hypo, 2)) {
				System.out.println("right");
				continue;
			}

			else
				System.out.println("wrong");
		}

	}

}

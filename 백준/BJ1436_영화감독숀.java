import java.util.Scanner;

public class BJ1436_¿µÈ­°¨µ¶¼ð {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = 0;
		int result = 0;

		while (true) {

			num++;
			if (String.valueOf(num).contains("666")) {
				n--;
			}

			if (n == 0) {
				result = num;
				break;
			}
		}

		System.out.println(result);

	}
}

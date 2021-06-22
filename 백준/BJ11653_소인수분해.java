import java.util.Scanner;

public class BJ11653_소인수분해 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 2;

		while (true) {
			if (num % count == 0) {
				num = num / count;
				System.out.println(count);
			}
			else count++;
			if(num == 1)break;
		}

	}

}

import java.util.Scanner;

public class BJ2231_ºÐÇØÇÕ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int result = 0;

		//216
		loops:
		for (int i = 1; i <= num; i++) {
			int j = i;
			int sum = 0;
			while(true) {
				sum += j%10;
				j = j/10;
				if(j==0)break;
			}
			if(num == i + sum) {
				result = i;
				break loops;
			}
		}

		System.out.println(result);

	}

}

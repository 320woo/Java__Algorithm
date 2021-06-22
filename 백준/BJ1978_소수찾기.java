import java.util.Scanner;

public class BJ1978_소수찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int result = 0;
		for (int i = 0; i < T; i++) {
			
			int num = sc.nextInt();
			int start = 2;
			int count = 0;
			
			if(num == 1)continue;
			while(num >= start) {
				if(num%start == 0)count++;
				start++;
			}
			if(count == 1)result++;
		}

		System.out.println(result);
	}

}

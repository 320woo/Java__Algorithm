import java.util.Scanner;

public class BJ2581_소수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		int first = 0;
		boolean flag = true;
		
		// 2 3 5 7로 나누었을때 나머지가 없으면 소수
		for (int i = num1; i <= num2; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if(i%j == 0)count++;
			}
			if(count == 1) {
				if (flag == true) {
					first = i;
					flag = false;
				}
				sum+=i;
				continue;
			}
			if(count>=2)continue;

		}

		if (sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(first);
		}

	}

}

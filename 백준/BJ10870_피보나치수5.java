import java.util.Scanner;

public class BJ10870_피보나치수5 {

	static int N = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int result = pibo(num);
		System.out.println(result);
	}

	private static int pibo(int num) {
	
		if(num == 0)return 0;
		if(num == 1)return 1;
		
		return pibo(num-2)+pibo(num-1);
		
	}

}

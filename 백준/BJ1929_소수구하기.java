import java.util.Scanner;

public class BJ1929_소수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean[] arr = new boolean[num2+1];
		
		arr[0] = false;
		arr[1] = false;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(arr.length); i++) {
			for (int j = i*i; j <= num2; j+=i) {
				arr[j] = false;
			}
		}
		
		for (int i = num1; i < arr.length; i++) {
			if(arr[i] == true)System.out.println(i);
		}
		
	}

}

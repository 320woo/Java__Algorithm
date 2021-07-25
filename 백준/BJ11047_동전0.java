import java.util.Scanner;

public class BJ11047_µ¿Àü0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			if(arr[i] > K)continue;
			count += K / arr[i];
			K = K - (arr[i] * (K / arr[i]));
			
	}
		System.out.println(count);
	}
	
}

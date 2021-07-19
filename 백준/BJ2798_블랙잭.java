import java.util.Scanner;

public class BJ2798_∫Ì∑¢¿Ë {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				for (int k = j+1; k < N; k++) {
					if(arr[i] + arr[j] + arr[k] == M)flag = false; 
					int sum = arr[i] + arr[j] + arr[k];
					
					if(M-sum>0) {
					min = Math.min(M-sum, min);
					}
				}
			}
		}

		if(flag == false)System.out.println(M);
		if(flag == true)System.out.println(M-min);
		
	}

}

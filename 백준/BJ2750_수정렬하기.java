package BJ_Done;
import java.util.Arrays;
import java.util.Scanner;

public class BJ2750_수정렬하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int T = sc.nextInt();
		
		int[] arr = new int[T];
		
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
	}
	
}

import java.util.Scanner;

public class BJ4948_베르트랑공준 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int num = sc.nextInt();
			int count = 0;
			if(num == 0)break;
			
			boolean[] arr = new boolean[(num*2)+1];
			for (int i = 2; i < arr.length; i++) {
				arr[i] = true;
			}
			
			arr[0] = arr[1] = false;
			for (int i = 2; i <= Math.sqrt(arr.length); i++) {
				for (int j = i*i; j <= num*2; j+=i) {
					arr[j] = false;
				}
			}
			
			for (int i = num+1; i < arr.length; i++) {
				if(arr[i] == true)count++;
			}
			
			System.out.println(count);
			
		}
		
	}

}
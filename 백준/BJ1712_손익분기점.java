import java.util.Scanner;

public class BJ1712_손익분기점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		long count = 1;
		long result = C;
		long start = A+B;
		
		if(B<C && A+B>=C) {
			while(true) {
				count++;
				start += B;
				result += C;
				if(start < result) {
					System.out.println(count);
					break;
				}
			}			
		}
		else if(B<C && A+B<=C) System.out.println(1);
		else System.out.println(-1);
	}

}

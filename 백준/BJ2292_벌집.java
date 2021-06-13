import java.util.Scanner;

public class BJ2292_¹úÁý {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		long floor = 1;
		long start = 1;
		long count = 1;
		long end = 0;
		
		if(num == 0)System.out.println(0);
		if(num == 1)System.out.println(1);
		if(num != 1) {
		while(true) {
			if(start == 1) {
				start+=1;
			}
			
			end = start+count*6 - 1;
			floor++;
			count++;
			if(start<=num && num<=end)break;
			start = end + 1;
		}
		
		System.out.println(floor);
		}
		
	}

}

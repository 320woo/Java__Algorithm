import java.util.Scanner;

public class BJ3053_택시기하학 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		String area1 = String.format("%.6f", Math.PI*r*r);
		String area2 = String.format("%.6f", (double)2*r*r);
		
		System.out.println(area1);
		System.out.println(area2);
	}

}

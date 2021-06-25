import java.util.Scanner;

public class BJ3009_네번째점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][2];
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int maxx = 0;
		int maxy = 0;
		int minx = max;
		int miny = max;

		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i][0] = x;
			arr[i][1] = y;
			maxx = Math.max(x, maxx);
			maxy = Math.max(y, maxy);
			minx = Math.min(x, minx);
			miny = Math.min(y, miny);
		}
		
//		System.out.println("maxx : " + maxx);
//		System.out.println("maxy : " + maxy);
//		System.out.println("minx : " + minx);
//		System.out.println("miny : " + miny);
		
		boolean[] point = new boolean[4];
		for (int i = 0; i < 3; i++) {
			if(arr[i][0] == minx && arr[i][1] == miny) {
				point[0] = true; 
			}
			
			if(arr[i][0] == minx && arr[i][1] == maxy) {
				point[1] = true; 
			}
			
			if(arr[i][0] == maxx && arr[i][1] == miny) {
				point[2] = true; 
			}
			
			if(arr[i][0] == maxx && arr[i][1] == maxy) {
				point[3] = true; 
			}
		}
		
		if(point[0] == false)System.out.println(minx + " " + miny);
		if(point[1] == false)System.out.println(minx + " " + maxy);
		if(point[2] == false)System.out.println(maxx + " " + miny);
		if(point[3] == false)System.out.println(maxx + " " + maxy);
		
	}

}

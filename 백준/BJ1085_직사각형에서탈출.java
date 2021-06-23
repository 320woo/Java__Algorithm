import java.util.Scanner;

public class BJ1085_직사각형에서탈출 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int minx = 0;
		int miny = 0;
		
		//가로값을 뺏을때
		if(w-x > x)minx = x;
		if(w-x < x)minx = w-x;
		if(w-x == x)minx = x;
		
		//세로값을 뺏을때
		if(h-y > y)miny = y;
		if(h-y < y)miny = h-y;
		if(h-y == y)miny = y;
		
		//두 값을 비교했을때 더 작은 값을 출력
		if(minx>miny)System.out.println(miny);
		else if(minx<miny)System.out.println(minx);
		
		//두 값이 같을 때 아무거나 출력
		else System.out.println(minx);
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		boolean[] alpha = new boolean[26];
		boolean flag = true;
		int count = 0;
		
		for (int i = 0; i < T; i++) {
			String s = sc.next();
			char[] c = new char[s.length()+1];
			
			for (int j = 0; j < alpha.length; j++) {
				alpha[j] = true;
			}
			
			for (int j = 1; j < c.length; j++) {
				c[j] = s.charAt(j-1);
//				System.out.println(c[j]-97);
				
				//1. 하나만 있을때
				if(alpha[c[j]-97] == true) {
					alpha[c[j]-97] = false;
					continue;
				}
					
				//2. 같은게 여러개 있을때
				if(c[j] == c[j-1] && alpha[c[j]-97] == false) {
					continue;
				}
				
				//3. 떨어져서 나왔을 때
				if(alpha[c[j]-97] == false) {
					flag = false;
					continue;
				}
			}
//			System.out.println(flag);
			if(flag == false)count--;
			count++;
//			System.out.println(count);
			flag = true;
			
		}
		
		System.out.println(count);
		
	}

}

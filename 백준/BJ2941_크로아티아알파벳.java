import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int count = 0;

		char[] c = new char[s.length()+1];
		
		for (int i = 1; i <= s.length(); i++) {
			c[i] = s.charAt(i-1);
		}

		for (int i = 1; i <= s.length(); i++) {
			if (c[i] == '=') {
				if (c[i - 1] == 'c' || c[i - 1] == 's' && c[i - 1] != ' ') {
					count--;
				}
				if (c[i - 1] == 'z' && c[i - 2] == 'd' && c[i - 1] != ' ') {
					count -= 2;
				}
				if (c[i - 1] == 'z' && c[i - 2] != 'd'&& c[i - 1] != ' ') {
					count--;
				}
			}

			if (c[i] == '-') {
				if (c[i - 1] == 'c' || c[i - 1] == 'd' && c[i - 1] != ' ') {
					count--;
				}
			}

			if (c[i] == 'j') {
				if (c[i - 1] == 'n' || c[i - 1] == 'l' && c[i - 1] != ' ') {
					count--;
				}
			}

			count++;
		}

		System.out.println(count);
	}

}

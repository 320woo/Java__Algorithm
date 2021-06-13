import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869_달팽이 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		//정상에 올라간 후에 미끄러지지 않는 경우를 생각해줘야 한다.
		//while문을 사용했을 경우에 시간초과가 뜬다.
		
		int day = (V-B) / (A-B);
		if((V-B) % (A-B) != 0) {
			day++;
		}
		System.out.println(day);
	}

}
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, quadrado = 0, cubo = 0, i;
		
		N = sc.nextInt();
		for (i = 1; i <= N; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			System.out.print(i + " ");
			System.out.print(quadrado + " ");
			System.out.println(cubo);
		}
		
		
		sc.close();

	}

}

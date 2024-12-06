package tempconv;
import java.util.Scanner;

public class TempConverter {
Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double t = getTemp();
		char si1 = getSI();
		char si2 = getSI();
		double result = calc(double t, char si1, char si2);
		System.out.println("Перевод выполнен: " + result);
	}

}

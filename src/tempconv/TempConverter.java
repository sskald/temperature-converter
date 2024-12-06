package tempconv;
import java.util.Scanner;

public class TempConverter {
Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double t = getTemp();
		char si1 = getSI();
		char si2 = getSI();
		double result = calc(t, si1, si2);
		System.out.println("Перевод выполнен: " + result);
	}
	
	public static double getTemp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите t*: ");
		if(sc.hasNextDouble()) {
			return(sc.nextDouble());
		} else {
			System.out.println("ОШИБКА ПРИ ВВОДЕ. ПОВТОРИТЕ ПОПЫТКУ");
			return getTemp();
		}
	}
	public static char getSI() {
		
	}
}

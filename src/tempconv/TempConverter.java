package tempconv;
import java.util.Scanner;

public class TempConverter {
Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double t = getTemp();
		String si1 = getSI();
		String si2 = getSI();
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
	public static String getSI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите способ перевода: \n1 - C*->F* \n2 - C*->K* \n3 - F*->C* \n4 - F*->K* \n5 - K*->C* \n6 - K*->F*");
		int SINumber = 0;
		if(sc.hasNextInt()) {
			SINumber = sc.nextInt();
		} else {
			System.out.println("ОШИБКА ПРИ ВЫБОРЕ. ПОВТОРИТЕ ПОПЫТКУ");
			return getSI();
		}
		switch (SINumber) {
		case 1:
			return "C*->F*";
		case 2:
			return "C*->K*";
		case 3:
			return "F*->C*";
		case 4:
			return "F*->K*";
		case 5:
			return "K*->C*";
		case 6:
			return "K*->F*";
		default:
			System.out.println("НЕПРАВИЛЬНЫЙ СПОСОБ ПЕРЕВОДА. ПОВТОРИТЕ ПОПЫТКУ");
			return getSI();
		}
	}
}

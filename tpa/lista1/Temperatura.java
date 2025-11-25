package lista1;
import java.util.Scanner;
import java.util.Locale;

public class Temperatura {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		double C;
		
		System.out.print("Digite a temperatura em Fahrenheit:");
		double F = ler.nextDouble();
		
		C = (F-32) * 5 / 9;
		
		System.out.print("Fahrenheit: "+F+" / Celsius: " +C);
		
		ler.close();

	}

}

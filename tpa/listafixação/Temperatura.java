package listafixação;
import java.util.Scanner;
import java.util.Locale;

public class Temperatura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite a temperatura em Fahreinheit: ");
		double f = ler.nextDouble();
		
		double c = (f-32) * 5 / 9;
		
		if(c < 15) {
			System.out.print(c+", Frio!");
		}else if (c >= 15 && c < 22 ) {
			System.out.print(c+", Ameno!");
		}else{
			System.out.print(c+", Quente!");
		}
		
		ler.close();

	}

}

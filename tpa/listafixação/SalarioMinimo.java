package listafixação;
import java.util.*;

public class SalarioMinimo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite seu salário: ");
		double salario =  ler.nextDouble();
		
		if(salario < 1302.00) {
			System.out.print("Abaixo do salário mínimo!");
		}else if(salario > 1302.00) {
			System.out.print("Acima do salário mínimo!");
		}
		
		
		
		ler.close();
		

	}

}

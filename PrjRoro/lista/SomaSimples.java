package lista;
import java.util.Scanner;

public class SomaSimples {
	
	//BEE 1003

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		a = ler.nextInt();
		
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma dos valores A e B é: " + soma);

	}

}

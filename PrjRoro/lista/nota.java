package lista;
import java.util.Scanner;

public class nota {
	
	//BEE 2344

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int nota=0;
		
		nota = ler.nextInt();
		
		if(nota == 0) {
			System.out.println("Sua nota é E");
		}
		else if(nota >= 1 && nota < 36) {
			System.out.println("Sua nota é D");
		}
		else if(nota >= 36 && nota < 61) {
			System.out.println("Sua nota é C");
		}
		else if(nota >= 61 && nota < 86) {
			System.out.println("Sua nota é B");
		}
		else {
			System.out.println("Sua nota é A");
		}
		

	}
}

package introducao;
import java.util.Scanner;
public class parouimpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		if(numero < 0) {
			System.out.println("N�o � poss�vel realizar calculos com n�meros negativos");
		}
		else if(numero ==0) {
			System.out.println("Esse n�mero � neutro");
		}
			else if (numero % 2 == 0) {
				System.out.println("Esse n�mero � par");
			}
			else {
				System.out.println("Esse n�mero � impar");
			}
			
				
				
				
	}

}

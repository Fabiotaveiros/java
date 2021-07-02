package introducao;
import java.util.Scanner;
public class parouimpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero < 0) {
			System.out.println("Não é possível realizar calculos com números negativos");
		}
		else if(numero ==0) {
			System.out.println("Esse número é neutro");
		}
			else if (numero % 2 == 0) {
				System.out.println("Esse número é par");
			}
			else {
				System.out.println("Esse número é impar");
			}
			
				
				
				
	}

}

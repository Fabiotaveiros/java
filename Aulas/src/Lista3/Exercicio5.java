package Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		/*5- Crie um programa que leia um n�mero do teclado 
		 * 	at� que encontre um
			n�mero igual a zero. No final, mostre a soma dos n�meros
			*digitados.(DO...WHILE)*/
		int numero=0;
		int numeroSoma=0;
		
			do
			{	
				System.out.println("Digite um n�mero: ");
				numero=leia.nextInt();
				numeroSoma+=numero;
			
			}while(numero!=0);
			System.out.println("A somativa dos n�meros �: "+ numeroSoma);
		
		
		
		
	}
}

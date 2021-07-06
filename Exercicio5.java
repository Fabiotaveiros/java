package Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		/*5- Crie um programa que leia um número do teclado 
		 * 	até que encontre um
			número igual a zero. No final, mostre a soma dos números
			*digitados.(DO...WHILE)*/
		int numero=0;
		int numeroSoma=0;
		
			do
			{	
				System.out.println("Digite um número: ");
				numero=leia.nextInt();
				numeroSoma+=numero;
			
			}while(numero!=0);
			System.out.println("A somativa dos números é: "+ numeroSoma);
		
		
		
		
	}
}

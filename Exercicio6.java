package Lista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		//0(zero).(DO...WHILE)
		
		int valorDigitado=0;
		double media=0.00;
		double soma=0.00;
		int multiplosDeTres=0;
			do 
			{
			System.out.println("Digite um valor inteiro: ");
			valorDigitado=leia.nextInt();
			if(valorDigitado%3==0) {
				multiplosDeTres++;
				soma+=valorDigitado;
			}
			}while(valorDigitado!=0);
			media = soma / multiplosDeTres;
			System.out.println("M�dia dos n�meros m�ltiplos de 3: " +media);
	}
}
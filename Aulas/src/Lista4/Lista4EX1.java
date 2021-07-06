package Lista4;

import java.util.Scanner;

public class Lista4EX1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
			//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		int[] pontuacao = new int[5];
		int maiorPontuacao=0;
		int i=0	;
		for(i=0; i<5; i++){
			System.out.println("Digite sua pontuação:");
			pontuacao[i]=leia.nextInt();
		}
		for(i=0; i<5; i++) {
			System.out.println("As notas digitadas foram "+"= "+pontuacao[i]);
		}
		for(i=0; i<5; i++) 
			if(maiorPontuacao < pontuacao[i]) 
				maiorPontuacao = pontuacao[i];
				System.out.println("A maior pontuação foi: "+maiorPontuacao);		
	}
}

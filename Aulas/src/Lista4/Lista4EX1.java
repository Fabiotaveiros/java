package Lista4;

import java.util.Scanner;

public class Lista4EX1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
			//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		int[] pontuacao = new int[5];
		int maiorPontuacao=0;
		int i=0	;
		for(i=0; i<5; i++){
			System.out.println("Digite sua pontua��o:");
			pontuacao[i]=leia.nextInt();
		}
		for(i=0; i<5; i++) {
			System.out.println("As notas digitadas foram "+"= "+pontuacao[i]);
		}
		for(i=0; i<5; i++) 
			if(maiorPontuacao < pontuacao[i]) 
				maiorPontuacao = pontuacao[i];
				System.out.println("A maior pontua��o foi: "+maiorPontuacao);		
	}
}

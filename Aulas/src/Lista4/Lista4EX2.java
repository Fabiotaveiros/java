package Lista4;

import java.util.Random;
import java.util.Scanner;
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
public class Lista4EX2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		Random dado = new Random();
		int [] vetorLancamento=new int [10];
		double media=0;
		double mediaAux=0;
		int maiorPontuacao=0;
			for(int i=0; i<10;i++) {
			vetorLancamento[i]=dado.nextInt(10)+1;
				System.out.println("Os números lançados foram: "+vetorLancamento[i]);
				media=media + vetorLancamento[i];
				if(vetorLancamento[i] > maiorPontuacao) 
					maiorPontuacao=vetorLancamento[i];
			}
				System.out.println("A média aritmética dos lançamentos foi: "+(mediaAux=media/vetorLancamento.length));
				System.out.println("O maior número tirado foi: "+maiorPontuacao);
			}
	}

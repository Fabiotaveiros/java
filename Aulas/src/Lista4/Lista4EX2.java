package Lista4;

import java.util.Random;
import java.util.Scanner;
/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
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
				System.out.println("Os n�meros lan�ados foram: "+vetorLancamento[i]);
				media=media + vetorLancamento[i];
				if(vetorLancamento[i] > maiorPontuacao) 
					maiorPontuacao=vetorLancamento[i];
			}
				System.out.println("A m�dia aritm�tica dos lan�amentos foi: "+(mediaAux=media/vetorLancamento.length));
				System.out.println("O maior n�mero tirado foi: "+maiorPontuacao);
			}
	}

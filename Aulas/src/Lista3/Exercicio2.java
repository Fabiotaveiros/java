package Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
			int numeros=0;
			int opnumero=0;
			int contadorImpar=0;
			int contadorPar=0;
			for(int x=1; x<=10; x++ ){
				System.out.println("Digite um n�mero: ");
				numeros=leia.nextInt();
				//opnumero++;
				if(numeros%2==1){
					contadorImpar++;
				}
				if(numeros%2==0){
					contadorPar++;
				}
			}
			System.out.println("N�meros pares: "+ contadorPar);
			System.out.println("N�meros �mpares: "+ contadorImpar);
		}
	}



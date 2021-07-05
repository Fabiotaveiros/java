package Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
			int numeros=0;
			int opnumero=0;
			int contadorImpar=0;
			int contadorPar=0;
			for(int x=1; x<=10; x++ ){
				System.out.println("Digite um número: ");
				numeros=leia.nextInt();
				//opnumero++;
				if(numeros%2==1){
					contadorImpar++;
				}
				if(numeros%2==0){
					contadorPar++;
				}
			}
			System.out.println("Números pares: "+ contadorPar);
			System.out.println("Números ímpares: "+ contadorImpar);
		}
	}



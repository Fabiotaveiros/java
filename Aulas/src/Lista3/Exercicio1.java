package Lista3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5. (FOR)
		
		for(int numeros=1000; numeros < 2000 ;numeros++) {
		if(numeros%11==5) {
			System.out.println(numeros);
			}
		}
			
		
		
		
		
		
		
		
	}

}

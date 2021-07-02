package Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[]args) {
		
		
		
		short d;
		short m;
		short a;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em Anos: ");
		a= ler.nextShort();
		System.out.println("Digite sua idade em meses: ");
		m= ler.nextShort();
		System.out.println("Digite sua idade em dias: ");
		d= ler.nextShort();
		d+=a*365 + m*30;
		
		System.out.println("Você tem aproximadamente "+d+ " dias de vida");
		
		
		
		
	}
}

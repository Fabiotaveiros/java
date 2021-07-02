package Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		final double diasdoano = 365;
		final double diasdomes = 30;
		short dias, meses, anos,diast;
		
		System.out.println("Sua idade em dias");
		dias= (short) ler.nextDouble();
		
		anos = (short) (dias / diasdoano);
		meses = (short) (diasdoano/diasdomes + dias);
		dias = (short) (anos*365 + meses*30);
		System.out.println(" Sua idade em anos é: "+  anos + " ,sua idade em meses é: " + meses+" e sua idade em dias é: " +dias);
	}

}

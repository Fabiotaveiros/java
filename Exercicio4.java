package Lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	int horas, minutos, segundos;
		
		System.out.println("Digite a duração do evento:" );
		segundos = ler.nextInt();
		horas= (segundos / 3600);
		minutos= ((segundos%3600)/60);
		segundos = ((segundos%3600)%60);
		
		System.out.println("A duração do evento foi de: "+ horas + " horas " + minutos + " minutos " + segundos + " segundos ");
		
	}
}

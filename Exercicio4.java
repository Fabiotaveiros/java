package Lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	int horas, minutos, segundos;
		
		System.out.println("Digite a dura��o do evento:" );
		segundos = ler.nextInt();
		horas= (segundos / 3600);
		minutos= ((segundos%3600)/60);
		segundos = ((segundos%3600)%60);
		
		System.out.println("A dura��o do evento foi de: "+ horas + " horas " + minutos + " minutos " + segundos + " segundos ");
		
	}
}

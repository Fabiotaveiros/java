package Lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[]args) {
		double d,x1,x2,y1,y2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor x1: ");
		x1 = ler.nextDouble();
		System.out.println("Digite o valor x2: ");
		x2 = ler.nextDouble();
		System.out.println("Digite o valor y1: ");
		y1 = ler.nextDouble();
		System.out.println("Digite o valor y2: ");
		y2 = ler.nextDouble();
		//processos fórmula
		d=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		System.out.printf("A distância de D é igual a: "+d);
		
		
		
	}
}

package programa;

import java.util.Scanner;

import objeto.Pessoa;
import objeto.utilidades;

public class CadBanca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa cliente1 = new Pessoa();
		utilidades linha = new utilidades();
		
		System.out.println("Digite seu nome: ");
		cliente1.nome=leia.next();
		System.out.println("Digite seu ano de nascimento: ");
		cliente1.anoNascimento=leia.nextInt();
		linha.linha(50);
		if(cliente1.calcularIdade(2021) >=18) {
			System.out.print("Você pode comprar tudoooooo!!!");
		linha.linha(50);
		} else {
			System.out.println("Proibido conteúdo menor de 18 anos!!!");
		
		}
	}
}

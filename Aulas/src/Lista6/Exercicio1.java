package Lista6;

import java.util.Scanner;

import objeto.AnimalCachorro;
import objeto.AnimalCavalo;
import objeto.AnimalPregui�a;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);		
		AnimalCachorro C = new AnimalCachorro ("Lilico",10,true);
		AnimalCavalo CA = new AnimalCavalo ("Thoroughbred", 16, true, "Preta");
		AnimalPregui�a P = new AnimalPregui�a ("Flecha", 32, true, true, "Branco");
		
		C.emitirSom();
		C.locomover();
		C.setCorPelo("Marrom");
		
		CA.emitirSom();
		CA.locomover();
		
		P.emitirsom();
		P.locomover();
		
	}

}

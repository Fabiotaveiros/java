package Lista5;

import objeto.Aviao;

public class exercicio2Lista5 {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao(); 
		
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIRO 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade=0;
		
		System.out.println("Como o avião está atualmente");
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		System.out.println("Indo pra pista");
		aviao1.ligarAviao(); 
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.decolar();
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.pousar();
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.desligarAviao();
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	}

}
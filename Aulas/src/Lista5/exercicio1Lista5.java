package Lista5;

import objeto.cliente;

public class exercicio1Lista5 {

	public static void main(String[] args) {
		cliente clienteBom = new cliente();
		
		clienteBom.nome = "Jos�";
		clienteBom.sexo = 'M';
		clienteBom.idade = 19;
		clienteBom.diasDaSemana = "Segunda-feira e quarta-feira";
		clienteBom.pedido=3;
		
		
		clienteBom.pedir();
		clienteBom.receber();
		clienteBom.pedir();
		clienteBom.receber();
		clienteBom.pedir();
		clienteBom.receber();
		System.out.println("Ap�s tr�s pedidos...");
		System.out.println("Parab�ns, voc� � um cliente vip "+clienteBom.tipoClienteBom);

	}

}

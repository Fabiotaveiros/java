package objeto;

public class Aviao {
	
	//atributos
		public int rodas;
		public String modelo;
		public String tipo;
		public boolean noAr;
		public int velocidade;
		public boolean ligado;
		public boolean desligado;
		
		
		public void ligarAviao() {
			ligado=true;
		}
		

		public void desligarAviao() {
			desligado=true;
		}
		
		public void decolar() {
			for(int x=1 ; x<10 ; x++) {
			 aumentarVelocidade();
			}
			noAr=true;
			System.out.println("Avião está decolando, coloquem seus cintos!!!");
		}
	
		public void pousar() {
			for(int x=1 ; x<=10 ; x++) {
				 diminuirVelocidade();
				}
			noAr=false;
		}
		public void aumentarVelocidade() {
			velocidade++;
		}
		public void aumentarVelocidade(int acrescimo) {
			velocidade += acrescimo;
		}
		public void diminuirVelocidade() {
			velocidade--;
		}
		public void diminuirVelocidade(int decrescimo) {
			velocidade-= decrescimo;
		}
}

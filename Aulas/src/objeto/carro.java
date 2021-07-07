package objeto;

public class carro {
	//estado
	public String cor; // cor do carro
	public String modelo; //escreva o modelo ex: Fiat Uno
	public int ano; // ano ex: 2008
	public double válvulas; //potencia do motor ex: 1.0, 1.5
	public Boolean bancoDeCouro; // tem ou não tem banco de couro?
	public char combustível; // Caso A = Alcóol, Caso F = flex, Caso D = Diesel.
	//comportamento
	public Boolean ligado; //Estado do carro, ele está ligado os desligado?
	public int velocidade;
	
	
	public void ligarCarro() {
		ligado = true;
		System.out.println("Carro ligando...");
	}
	public void desligarCarro() {
		if(velocidade==0) {
			ligado = false;
			System.out.println("Carro desligando...");
		} else {
			System.out.println("Carro ainda em movimento, desacelere primeiro.");
		}
	}
	public void acelerar() {
		velocidade++;
	}
	public void desacelerar() {
		velocidade--;
	}	
}

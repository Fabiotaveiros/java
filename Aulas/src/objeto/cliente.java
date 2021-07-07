package objeto;

public class cliente {

	public String nome;
	public char sexo; //M = masculino F = feminino O = outros
	public int idade;
	public boolean tipoClienteBom;
	public String diasDaSemana;
	public int pedido;
	public boolean pedidoRecebido;
	
	public void pedir() {
		if(pedido >= 3) {
			tipoClienteBom=true;
		}
		System.out.println("Quero comprar");
	}
	public void receber() {
		System.out.println("Tome seu pedido");
	}
	
	
}

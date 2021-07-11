package objeto;

public class AnimalCachorro extends Animal {

	private String corPelo;

	public AnimalCachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom) {
		super(nomeAnimal, idadeAnimal, emiteSom);
	}
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public void emitirSom() {
	System.out.println("Au au au");
	}
	public void locomover() {
		System.out.println("Correndo...");
	}
	
	
	
	
	
}

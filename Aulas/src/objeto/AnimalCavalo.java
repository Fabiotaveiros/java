package objeto;

public class AnimalCavalo extends Animal {
	private String CorCrina;

	public AnimalCavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String corCrina) {
		super(nomeAnimal, idadeAnimal, emiteSom);
		CorCrina = corCrina;
	}

	public String getCorCrina() {
		return CorCrina;
	}

	public void setCorCrina(String corCrina) {
		CorCrina = corCrina;
	}
	public void locomover() {
		System.out.println("Trotando...");
	}
	public void emitirSom() {
		System.out.println("Relinchando");
	}
}

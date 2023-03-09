package CruzVita;

public class Cartas {
	private String nome;
	private String naipe;
	
	public Cartas(String nome, String naipe) {
		this.naipe = naipe;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNaipe() {
		return naipe;
	}
	
	public void setNaipe(String naipes) {
		this.naipe = naipes;
	}
	@Override 
	public String toString() {
		return nome + " de " + naipe;
	}
	
}
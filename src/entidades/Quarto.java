package entidades;

public class Quarto {
	private String nome;
	private String email;
	private int numQuarto;
	
	public Quarto(String nome, String email, int numQuarto) {
		this.nome = nome;
		this.email = email;
		this.numQuarto = numQuarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public String toString() {
		return "Quarto \nnome: " + nome + " \nEmail: " + email + " \nNumero do Quarto: " + numQuarto;
	}

	
	
	
	
	
}

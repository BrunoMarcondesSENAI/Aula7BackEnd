package aula7be.ativs;

public class Consulta {
//VARIAVEIS
	String data;
	String nomePcnte;
	String nomeDents;

//	CONSTRUTORES
	public Consulta(String data) {
		this.data = data;
	}
	
	public Consulta(String data, String nomePcnte, String nomeDents) {
		this.data = data;
		this.nomePcnte = nomePcnte;
		this.nomeDents = nomeDents;
	}

//	GETTERS
	public String getData() {
		return data;
	}

	public String getNomePcnte() {
		return nomePcnte;
	}

	public String getNomeDents() {
		return nomeDents;
	}
}
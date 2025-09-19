package aula7be;

public class Pessoa {
//	VARIÁVEIS
	private String nome;
	private int idade;

//	CONSTRUTOR
	public Pessoa(String nome) {
		this.nome = nome;

	}

	public Pessoa(int idade) {
		this.idade = idade;
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

//	GETTERS

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

}
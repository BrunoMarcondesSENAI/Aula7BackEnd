package aula7be.ativs;

public class Animal {
//	VARIAVEIS
	float tamanho;
	String cor;

//	CONSTRUTORES
	public Animal(float tamanho) {
		this.tamanho = tamanho;
	}

	public Animal(String cor) {
		this.cor = cor;
	}

	public Animal(float tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}

//	GETTERS
	public float getTamanho() {
		return tamanho;
	}

	public String getCor() {
		return cor;
	}
}
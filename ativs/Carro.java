package aula7be.ativs;

public class Carro {
//	VARIAVEIS
	String placa;
	int numChassi;

//	CONSTRUTORES
	public Carro(String placa) {
		this.placa = placa;
	}

	public Carro(int numChassi) {
		this.numChassi = numChassi;
	}

	public Carro(String placa, int numChassi) {
		this.placa = placa;
		this.numChassi = numChassi;
	}

//	GETTERS
	public String getPlaca() {
		return placa;
	}

	public int getNumChassi() {
		return numChassi;
	}

}
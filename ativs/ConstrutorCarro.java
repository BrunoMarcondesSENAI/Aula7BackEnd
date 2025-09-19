package aula7be.ativs;

public class ConstrutorCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro(1234);
		Carro carro2 = new Carro("ABC1D34");
		Carro carro3 = new Carro("RUA4H89", 2194);

		System.out.println(carro1.numChassi);

		System.out.println();

		System.out.println(carro2.placa);

		System.out.println();

		System.out.println(carro3.placa + " " + carro3.numChassi);
	}

}
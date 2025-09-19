package aula7be;

public class ConstrutorPessoa {
	public static void main(String[] args) {

		Pessoa jogador1 = new Pessoa("Messi");
		Pessoa jogador2 = new Pessoa(36);
		Pessoa jogador3 = new Pessoa("Bruno", 16);

		System.out.println(jogador1.getNome());

		System.out.println("");

		System.out.println(jogador2.getIdade());

		System.out.println("");

		System.out.println(jogador3.getNome());
		System.out.println(jogador3.getIdade());
	}

}
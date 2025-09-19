package aula7be.ativs;

public class ConstrutorAnimal {
	public static void main(String[] args) {
		Animal animal1 = new Animal(124);
		Animal animal2 = new Animal("Branco");
		Animal animal3 = new Animal(50, "Marrom");

		System.out.println(animal1.getTamanho());

		System.out.println("");

		System.out.println(animal2.getCor());

		System.out.println("");

		System.out.println(animal3.getTamanho() + " " + animal3.getCor());

	}

}
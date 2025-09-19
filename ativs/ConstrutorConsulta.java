package aula7be.ativs;

public class ConstrutorConsulta {
	public static void main(String[] args) {
		Consulta Um = new Consulta("10/12/2025");
		Consulta Dois = new Consulta("15/08/2002", "Jéssica", "Josué");
		Consulta Tres = new Consulta("6/10/20", "Jorge", "João");
		
		System.out.println(Um.getData());
		
		System.out.println("");
		
		System.out.println(Dois.getData() + " " + Dois.getNomePcnte() + " " + Dois.getNomeDents());
		
		System.out.println("");
		
		System.out.println(Tres.getData() + " " + Tres.getNomePcnte() + " " + Tres.getNomeDents());
		
	}

}

package progrma1;

public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	public void fazAniversario() {
		idade++;
	}
	
	public void imprimirIdade() {
		System.out.println(nome+"Tem "+idade+"anos");
	}

}

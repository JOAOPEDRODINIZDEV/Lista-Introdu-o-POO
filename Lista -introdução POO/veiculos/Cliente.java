package veiculos;

public class Cliente {
	String nome;
	String cpf;
	String telefone;
	Endereco endereco ;
	
	public void cadastrarCliente(String nome, String cpf, String fone) {
		this.nome = nome;
		this.cpf=cpf;
		this.telefone=fone;
		endereco = new Endereco();
		endereco.InformacaoEndereco(rua,numero,bairro,cidade);
		
		
	}
	
	public void imprimirCadastroCliente(){
      System.out,println("Nome do Cliente"+this.nome);
      System.out,println("CPF"+this.cpf);
      System.out,println("Telefone"+this.telefone);
      System.out,println("Rua"+this.endereco.rua);
      System.out,println("Número"+this.endereco.numero);
      System.out,println("Bairro"+this.endereco.bairro);
      System.out,println("Cidade: "+this.endereco.cidade);


}

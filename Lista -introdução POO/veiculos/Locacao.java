package veiculos;

import java.time.LocalDateTime;

public class Locacao {
	Carro c;
	LocalDateTime dataLocaco;
	LocalDateTime dataDevolucao;
	double valor;
	Cliente clienete;
	
	public void imprimirLocacao() {
		System.out.println("*** Locação de veiculo");
		System.out.println("Modelo: "+this.c.modelo.descricao);
		System.out.println("placa: "+this.c.placa);
		System.out.println("Cor: "+this.c.cor);
		System.out.println("Ano: "+this.c.ano);
		System.out.println("VAlor: "+this.c.valor_locacao);
		System.out.println("Cliente: "+this.clienete);
		System.out.println("Data da Locao: "+this.dataLocaco.toString());
		System.out.println("Data de devolucao: "+this.dataDevolucao.toString());
		
	}	
	
}

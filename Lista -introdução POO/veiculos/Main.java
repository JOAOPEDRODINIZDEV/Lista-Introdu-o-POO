package veiculos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "João Pedro";
		c1.cpf = "12345678913";
		c1.telefone = "88996927816";
		c1.ender.bairro = "Patos";
		c1.ender.cidade = "Várzea Alegre";
		c1.ender.numero = 182;
		c1.ender.rua = "Avenida Portugual";
		
		c1.MostrarCliente();
		
		Automovel carro1 = new Automovel();
		carro1.CadastrarCarro(789456, "Branco", 2023, "Flex", 4, 0, "456", "74565", 6500, "Corolla XEI", "Toyota");
		
		carro1.MostrarCarro();
		Locacao loca1 = new Locacao();
		loca1.carro = carro1;
		loca1.cliente = c1;
		loca1.valor = 6500;
		loca1.dataLocacao = LocalDateTime.of(2023, 10, 25, 12, 0); // ano -- mes -- dia -- hora -- minuto;
		loca1.dataDevo = LocalDateTime.of(2023, 10, 25, 12, 0); // ano -- mes -- dia -- hora -- minuto
		
		loca1.MostrarLocacao();
		loca1.MostrarLocacao();
	
	}

}

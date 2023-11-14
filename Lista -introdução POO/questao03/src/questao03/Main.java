package questao03;

public class Main {

	public static void main(String[] args) {
		Casa c = new Casa();
		c.pinta("Azul");
		
		Porta p = new  Porta();
		p.p1();
		p.p2();
		p.p3();
		p.quantasPortasEstaoAbertas(false, false, true);
		

		
	}

}
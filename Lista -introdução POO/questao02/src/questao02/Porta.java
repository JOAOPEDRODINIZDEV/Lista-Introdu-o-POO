package questao02;

public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	
	public void abre() {
		if(!aberta) {
			aberta =true;
			System.out.println("A porta abriu");
		}
	}
	
	public void fecha() {
		if(aberta) {
			aberta=false;
			System.out.println("A porta fechou");
		}
		
		
	}
	public void pinta(String cor) {
		this.cor=cor;
		System.out.println("A porta foi pintada com a cor: "+cor);
		
		
	}
	public boolean estaAberta() {
		if (aberta){
			System.out.println("A porta esta aberta");
		}else {
			System.out.println("A porta esta fechada");
		}
	return aberta;
	}

	
	public void dimesaoes(double dimesaoX, double dimensaoY, double dimensaoZ ) {
		this.dimensaoX=dimesaoX;
		this.dimensaoY=dimensaoY;
		this.dimensaoZ=dimensaoZ;
		System.out.println("A dimensao da porta do raio X é: "+dimensaoX);
		System.out.println("A dimensao da porta do raio Y é:: "+ dimensaoY);
		System.out.println("A dimensao da porta do raio Z é: "+dimensaoZ);
	}
}
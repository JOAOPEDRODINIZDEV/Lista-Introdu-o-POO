package questao03;

public class Porta {
	boolean porta1;
	boolean porta2;
	boolean porta3;
	int contador;
	
	public void p1() {
		if(!porta1) {
			this.porta1=true;
			System.out.println("A porta 1 esta "+this.porta1);
		}
		
	}
	
	public void p2() {
		if(!porta2) {
			this.porta2 =false;
			System.out.println("A porta 2 esta "+this.porta2);
		}else{
			System.out.println("A porta 2 esta aberta");
		}
		
	}
	
	public void p3() {
		if(!porta3) {
			this.porta3 = true;
			System.out.println("A porta 3 esta "+this.porta3);
		}
		
	}
	public void quantasPortasEstaoAbertas(boolean porta1, boolean porta2, boolean porta3) {
		contador = 0;
		if(this.porta1==true) {
			contador++;
			
		}
		if(this.porta2==true) {
			contador++;
		}
		if(this.porta3==true) {
			contador++;
		}
		System.out.println("Numeros de portas abertas: "+contador);
	}

}

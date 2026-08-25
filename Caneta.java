public class Caneta {
	String modelo, cor;
	Double ponta;
	int carga; 
	boolean tampa;
	
	public Caneta(String modelo, String cor, Double ponta, int carga, boolean tampa){
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampa = tampa;
	}
	
	void status(){
		System.out.println("Caneta: " + this.modelo + ", Cor: " + this.cor + ", Ponta: " + this.ponta + ", Carga: " + this.carga + (tampa == true ? ", Caneta tampada." : ", Caneta destampada."));
	}
	
	void rabiscar(){
		if(this.tampa)
			System.out.println("Caneta tampada! Impossível rabiscar.");
		else 
			System.out.println("Rabiscando.");
	}
	
	void tampar(){
		this.tampa = true;
	}
	
	void destampar(){
		this.tampa = false;
	}
}

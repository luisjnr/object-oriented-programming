public class Caneta {
	public String modelo, cor;
	private double ponta;
	protected int carga;
	private boolean tampa;
	
	public Caneta(String modelo, String cor, double ponta, int carga){
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampa = true;
	}
	
	public void status(){
		System.out.println("Uma caneta " + this.cor + 
		(this.tampa ? "Tampada." : "Destampada.") + "\nModelo: " + this.modelo
		+ "\nPonta: " + this.ponta + "\nCarga: " + this.carga);
	}
	
	public void rabiscar(){
		if(this.tampa)	
			System.out.println("Impossível rabiscar! Caneta tampada.");
		else
			System.out.println("Rabiscando.");
	}
	
	protected void tampar(){
		this.tampa = true;
	}

	protected void destampar(){
		this.tampa = false;
	}
	
	
}
